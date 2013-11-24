package com.newchess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardInput {
	protected String keyboardInString() throws IOException{
		
	     BufferedReader stdin =
	             new BufferedReader (new
	                 InputStreamReader(System.in));
		return stdin.readLine();
		
	}
	protected double keyboardInInt() throws IOException{
		
	     BufferedReader stdin =
	             new BufferedReader (new
	                 InputStreamReader(System.in));	     
		return Double.parseDouble(stdin.readLine());
		
	}

}
