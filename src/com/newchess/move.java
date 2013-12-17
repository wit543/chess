package com.newchess;


public class move {
	public move(){
		
	}
	public void moveChess(int[] input){
		int IntfromX = input[0];
		int IntfromY = input[1];
		int InttoX = input[2];
		int InttoY = input[3];
		if(input[4]==1){
		chessPieces s= new space();
		chessPieces chessmove = board.board[IntfromX][IntfromY];		
		board.board[InttoX][InttoY] = chessmove;
		board.board[IntfromX][IntfromY] = s;
		}
		else{
			System.out.println("invalid");
		}
	}
}
