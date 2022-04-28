package com.app.dto;



@AllArgsConstructor
@NoArgsConstructor
@Data

public class Response {
	
	private boolean is_success;
	private int user_id;
	private String email;
	private double roll_number;
	private int[] numbers;
	private char[] alphabets;

 

}