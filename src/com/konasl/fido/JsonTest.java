package com.konasl.fido;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {
	
	public static void main(String args[]) throws JsonProcessingException{
		
		ObjectMapper om = new ObjectMapper();
		
		SamplePojo sp = new SamplePojo();
		
		sp.setServerData("qqww1122");
		sp.setUserName("KonaSL");
		
		//Convert object to JSON string
		String jsonInString = om.writeValueAsString(sp);
		System.out.println(jsonInString);
		
		//Convert object to JSON string and pretty print
		jsonInString = om.writerWithDefaultPrettyPrinter().writeValueAsString(sp);
		System.out.println(jsonInString);
	}

}
