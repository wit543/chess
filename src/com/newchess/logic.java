package com.newchess;

public class logic {
	int[] test(int[] input){
		int IntfromX = input[0];
		int IntfromY = input[1];
		int InttoX = input[2];
		int InttoY = input[3];
		chessPieces p = new pawn();
		chessPieces r = new rook();
		chessPieces b = new bishop();
		chessPieces kn = new knight();
		chessPieces q = new queen();
		chessPieces k = new king();
		boolean output=false;
		if(board.board[IntfromX][IntfromY].characteristic[3]==1){
			output = p.logic(IntfromX, IntfromY, InttoX, InttoY);
		}
		else if(board.board[IntfromX][IntfromY].characteristic[3]==2){
			output = r.logic(IntfromX, IntfromY, InttoX, InttoY);
		}
		else if(board.board[IntfromX][IntfromY].characteristic[3]==3){
			output = b.logic(IntfromX, IntfromY, InttoX, InttoY);
		}
		else if(board.board[IntfromX][IntfromY].characteristic[3]==4){
			output = kn.logic(IntfromX, IntfromY, InttoX, InttoY);
		}
		else if(board.board[IntfromX][IntfromY].characteristic[3]==5){
			output = q.logic(IntfromX, IntfromY, InttoX, InttoY);
		}
		else if(board.board[IntfromX][IntfromY].characteristic[3]==1){
			output = k.logic(IntfromX, IntfromY, InttoX, InttoY);
		}
		int[] outputArray= new int[5]; 
		if(output==true){
			outputArray[0]=IntfromX;
			outputArray[1]=IntfromY;
			outputArray[2]=InttoX;
			outputArray[3]=InttoY;
			outputArray[4]=1;			
		}
		else{
			outputArray[0]=IntfromX;
			outputArray[1]=IntfromY;
			outputArray[2]=InttoX;
			outputArray[3]=InttoY;
			outputArray[4]=0;		
		}
		return outputArray;
		
	}	
}
