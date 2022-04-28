package com.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Example_one {

	@PostMapping("/example1")
	
public Response example1(Request req) {
		Response response =new Response();
		
		int place=0,place2=0;
		Object[] obj =req.getAlphabets;
		char[] alphabets = new char[obj.length];
		int[] num = new int[obj.length];
		for(int i=0;i<obj.length;i++) {
			if(Character.isLetter((char)obj[i])) {
				alphabets[place++]=(char)obj[i];
				
			}else {
				num[place2]=(int)obj[i];
			}
		}
		response.set_success(true);
		response.setAlphabet(alphabets);
		response.setNumbers(num);
		response.SetEmail("chinmayeek03@gmail.com");
		response.setRoll_number(123456);
		response.setUser_id("chinamyee_kulkarni_210943120045");
		
	}
}
