package com.vikas.postRequest;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NoHttpResponseException;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.lang.StringUtils;
public class PostRequest {

	public static void main(String[] args) {
		try {
			PostRequest postRequest = new PostRequest();
			String requestUrl = "https://open.pkfare.com/apitest/shopping";
			String requestBody = postRequest.readFileAsString("C:/Users/ecare/Desktop/pkfareRequest.txt");
			requestBody = postRequest.bas64Conversion(requestBody);
			requestUrl+="?param="+requestBody;
			String response = postRequest.postXMLRequest(requestUrl);
			System.out.println("response"+response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public String postXMLRequest(/*String request,*/ String serviceUrl) throws Exception {
		String response = null;
		PostMethod post = null;
		try {
			post = new PostMethod(serviceUrl);
			
			//byte bytearray[] = request.getBytes();
			//InputStream stream = new ByteArrayInputStream(bytearray);
			HttpClient httpclient = new HttpClient();
			httpclient.getParams().setParameter("http.protocol.content-charset", "UTF-8");
			//post.setRequestEntity(new InputStreamRequestEntity(stream)); 
			
			post.setRequestHeader("Content-type", "application/json");
			response = null;
			httpclient.executeMethod(post);
			 StringWriter responseBody = new StringWriter();
             PrintWriter responseWriter = new PrintWriter(responseBody);
             GZIPInputStream zippedInputStream =  new GZIPInputStream(post.getResponseBodyAsStream());
             BufferedReader r = new BufferedReader(new InputStreamReader(zippedInputStream));
             String line = null;
               while( (line =r.readLine()) != null){
                 responseWriter.println(line);
               }
             response= responseBody.toString();
			//response = post.getResponseBodyAsString();
			if (StringUtils.isEmpty(response)) {
				throw new NoHttpResponseException();
			}
		} catch (Exception e) {
			throw new Exception("Error occur while sending xml request to serviceUrl: " + serviceUrl + " due to: "
					+ e.getMessage(), e);
		} finally {
			if (post != null) {
				post.releaseConnection();
			}
		}
		return response;
	}
	public String bas64Conversion(String content){
		byte[] bytes = content.getBytes();
		//Convert byte[] to String
		String s = "";//Base64.getEncoder().encodeToString(bytes);
		return s;
	}
	private String readFileAsString(String filePath){
	    String content = "";
	    try{
	        content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
	    }
	    catch (IOException e){
	        e.printStackTrace();
	    }
	    return content;
	}
}
