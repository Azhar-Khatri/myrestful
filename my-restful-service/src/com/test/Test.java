package com.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.my.model.CustomerRegistration;
import com.my.model.Retailer;
import com.my.model.Wallet;

public class Test {
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	ObjectMapper mapper = new ObjectMapper();
	CustomerRegistration obj = new CustomerRegistration();

	//Object to JSON in file
	//mapper.writeValue(new File("c:\\file.json"), obj);

	//Object to JSON in String
	String jsonInString = mapper.writeValueAsString(obj);
	System.out.println(jsonInString);
	
	JsonNode tree = mapper.readTree(jsonInString);
	System.out.println(tree.path("srcType").asText());
	
	String binNumber = "A12345545";
	// setting BIN
	if (binNumber.length() > 5)
	{
		System.out.println(binNumber.substring(0, 6));
	}

}
}
