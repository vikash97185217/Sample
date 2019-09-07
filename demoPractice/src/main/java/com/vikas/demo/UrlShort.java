package com.vikas.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.lang.StringUtils;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;


public class UrlShort
{

    private static final String GOOGLE_SHORTEN_URL = "https://www.googleapis.com/urlshortener/v1/url?key=AIzaSyDYvIPygn8sNsn1fh4nO8tPgX2qEVUCy-Q";    //replace key's value with your key

    public static String shortURL(String longURL)
    {
        String shortURL = "";
        HttpsURLConnection con = null;
        try
        {
            Map<String, String> valueMap = new HashMap<String, String>();
            valueMap.put("longUrl", longURL);
            String requestBody = new JSONSerializer().serialize(valueMap);
            con = (HttpsURLConnection) new URL(GOOGLE_SHORTEN_URL).openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.getOutputStream().write(requestBody.getBytes());
            if (con.getResponseCode() == 200)
            {
                StringBuilder sb = new StringBuilder();
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                try
                {
                    String line;
                    while((line = br.readLine()) != null)
                    {
                        sb.append(line);
                    }
                    Map<String, String> map = new JSONDeserializer<Map<String, String>>().deserialize(sb.toString());

                    if (map != null && StringUtils.isNotEmpty(map.get("id")))
                    {
                        shortURL = map.get("id");
                        return shortURL;
                    }
                }
                catch(IOException e)
                {
                    e.printStackTrace(); 
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace(); 
        }
        return shortURL;

    }
    public static void main(String[] args) {
    	String url = shortURL("http://2.ecareibe.com/process-user-online-payment?requestURI=Zmlyc3RuYW1lPXNkdnNkICwgZW1haWw9dmlrYXNoLmVyLmNzMUBnbWFpbC5jb20sIG1vYmlsZT05MTEyMzQ1Njc4OTAsIGFtb3VudD0yMDAxLjAsIGJvb2tpbmdSZWZObz1JSC0xMDAwMDk3NywgcmVtYXJrcz1Cb29rZWQgYW5kIFRpY2tldGVkIFN1Y2Nlc3NmdWxseS4=");
    	System.out.println(url);
    }
}