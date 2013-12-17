package com.newchess;

import java.io.IOException;

public class Input extends KeyBoardInput {
	String getInput(){
		String input = "invalid";
		try {
			 input =keyboardInString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("invalid");
		}
		return input;
	}
}
