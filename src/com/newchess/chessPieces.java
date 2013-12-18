package com.newchess;

import java.util.ArrayList;
import java.util.List;

public class chessPieces {
	int[] characteristic= new int[5];
	String icon;// two option for initialize 1)input in board 2) use if else and get input from  [2]
	List<String> characteristics = new ArrayList<String>();
	/*
	 * [0] = x position
	 * [1] = y position
	 * [2] = color(1=black 0 = white)
	 * [3] = type(
	 * 				0=space
	 * 				1=pawn
	 * 				2=rook
	 * 				3=bishop
	 * 				4=knight
	 * 				5=queen
	 * 				6=king
	 * [4] = point
	 *  			0=space
	 * 				1=pawn
	 * 				5=rook
	 * 				3=bishop
	 * 				3=knight
	 * 				9=queen
	 * 				0=king
	 * 	*/
	void setcharacteristic(int x, int y){
		characteristic[0] = x;
		characteristic[1] = y;
		
	}
	void setcharacteristic(int x, int y, int z){
		characteristic[0] = x;
		characteristic[1] = y;
		characteristic[2] = z;
	}
	void setcharacteristic(int x, int y, int z, int a){
		characteristic[0] = x;
		characteristic[1] = y;
		characteristic[2] = z;
		characteristic[3] = a;
	}
	void setcharacteristic(int x, int y, int z, int a,int b){
		characteristic[0] = x;
		characteristic[1] = y;
		characteristic[2] = z;
		characteristic[3] = a;
		characteristic[4] = b;
	}
	
	
	int getcharacteristic(int iX){		
		return characteristic[iX];
	}
	void setcharacteristicSpace(String s){
		icon = s;
	}
	boolean logic(int IntfromX,int IntfromY,int InttoX,int InttoY){
		
		
		return false;		
	}
}
