package com.ideas.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.ideas.beans.Person;

public class SimpleJson {

	public static JSONObject ReplaceLastName(String payload) {
		
		JSONObject jsonText = null;
		
		try {
			// Parse Json to Object
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(payload);
			JSONObject jsonObject = (JSONObject) obj;			
			
			//Set vars
			String firstName = (String) jsonObject.get("firstName");
			String lastName = "Tesla";
			
			// Create Object person
			Person person = new Person();
			person.setFirstName(firstName);
			person.setLastName(lastName);
			System.out.println(person.toString());
			
			// Object to Json
			JSONObject json = new JSONObject();
			json.put("firstName", firstName);
			json.put("lastName", lastName);
			jsonText = json;

			System.out.println("Encode a JSON Object - to String");
			System.out.print(jsonText);			

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return jsonText;

	}

	

}
