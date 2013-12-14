package com.newchess;

import java.util.ArrayList;
import java.util.List;

public class chessPieces {
	int[] characteristic= new int[3];
	String icon;// two option for initialize 1)input in board 2) use if else and get input from  [2]
	List<String> characteristics = new ArrayList<String>();
	/*
	 * [0] = x position
	 * [1] = y position
	 * [2] = color(0=black 1 = white)*/
	void setcharacteristic(int x, int y){
		characteristic[0] = x;
		characteristic[1] = y;
		
	}
	void setcharacteristic(int x, int y, int z){
		characteristic[0] = x;
		characteristic[1] = y;
		characteristic[2] = z;
	}
	
	int getcharacteristic(int iX){		
		return characteristic[iX];
	}
	
}
