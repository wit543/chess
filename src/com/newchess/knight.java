package com.newchess;

public class knight extends chessPieces {
	public knight(){
		
	}
	public knight(int i, int j, int k, String l) {
		characteristic[0] = i;
		characteristic[1] = j;
		characteristic[2] = k;
		characteristic[3] = 4;
		characteristic[4] = 3;
		icon = l;
	}
	boolean logic(int IntfromX,int IntfromY,int InttoX,int InttoY){
		
		boolean output= false;
		if(((board.board[IntfromX][IntfromY].characteristic[2]==0)&&(board.board[InttoX][InttoY].characteristic[2]==0))||((board.board[IntfromX][IntfromY].characteristic[2]==1)&&(board.board[InttoX][InttoY].characteristic[2]==1))){
		}
		else{
			if((((InttoX == IntfromX+2 && InttoY== IntfromY+1)||(InttoX == IntfromX+2 && InttoY== IntfromY-1))||
				((InttoX == IntfromX-2 && InttoY== IntfromY+1)||(InttoX == IntfromX-2 && InttoY== IntfromY-1)))||
				(((InttoX == IntfromX+1 && InttoY== IntfromY+2)||(InttoX == IntfromX+1 && InttoY== IntfromY-2))||
				((InttoX == IntfromX-1 && InttoY== IntfromY+2)||(InttoX == IntfromX-1 && InttoY== IntfromY-2)))){
				output =true;
			}
			else{
				output =false;
			}
		}
		return output;
	}
}
