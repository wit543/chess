package com.newchess;

public class king extends chessPieces {
	public king(){
		
	}
	public king(int i, int j, int k, String l) {
		characteristic[0] = i;
		characteristic[1] = j;
		characteristic[2] = k;
		characteristic[3] = 6;
		characteristic[4] = 0;
		icon = l;
	}

}
