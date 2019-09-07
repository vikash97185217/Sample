package com.mkyong;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	@RequestMapping("/BalmerBookingsJson")
	@ResponseBody
	public String welcomejson() {
		String s = readFileAsString("C:/Users/ecare/Desktop/new.txt");
		DataJava searchResponse =null;
		try {
			searchResponse=(DataJava) parseJsonObject(s, DataJava.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	//added util method to load text file and return it as string
		public  String readFileAsString(String filePath){
		    String content = "";
		    try{
		        content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
		    }
		    catch (IOException e){
		        e.printStackTrace();
		    }
		    return content;
		}
		@SuppressWarnings("unchecked")
		public Object parseJsonObject(String response,Class classtype)throws Exception{
			Object object=null;
			try{
				ObjectMapper mapper=new ObjectMapper();
				mapper.setSerializationInclusion(Include.NON_NULL);
				mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				object=mapper.readValue(response, classtype);
			}catch(Exception e){
				 e.printStackTrace();
				
			}
			return object;
		}
}