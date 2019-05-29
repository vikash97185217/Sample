package com.vikas.demo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ArrayNodeMain {

	public static void main(String[] args) {
		System.out.println("Main starts");
		String address1 = "delhi 33";
    	String address2 = "jdbd";
    	String city = "delhi";
    	String state = "up";
    	int picode = 123456;
    	String mobile_no = "9876543210";
    	int otp_capture = 1;
    	String email_id = "viaks@1234gmail.com";
    	JSONArray json = new JSONArray();
    	JSONObject row = new JSONObject();
    	JsonNodeFactory nodeFactory = JsonNodeFactory.instance;
    	ArrayNode filesListNode = nodeFactory.arrayNode();
    	try {
			row.put("1", address1);
			row.put("2", address2);
			row.put("3", city);
			row.put("4", state);
			row.put("5", picode);
			row.put("6", mobile_no);
			row.put("7", mobile_no);
			row.put("8", email_id);
			row.put("9", mobile_no);
			json.put(row);
		
	    	ObjectNode fileNode = nodeFactory.objectNode();
	        fileNode.set("1", nodeFactory.textNode(address1));
	        fileNode.set("2", nodeFactory.textNode(address2));
	        fileNode.set("3", nodeFactory.textNode(city));
	        fileNode.set("4", nodeFactory.textNode(state));
	        fileNode.set("5", nodeFactory.textNode(String.valueOf(picode)));
	        fileNode.set("6", nodeFactory.textNode(mobile_no));
	        fileNode.set("7", nodeFactory.textNode(email_id));
	        
	        filesListNode.add(fileNode);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    		System.out.println("json output:"+json);
    		System.out.println("filesListNode output:"+filesListNode);
    	
	}

}
