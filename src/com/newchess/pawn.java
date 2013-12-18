package com.newchess;


public class pawn extends chessPieces {

	public pawn(int i, int j, int k, String l) {
		characteristic[0] = i;
		characteristic[1] = j;
		characteristic[2] = k;
		characteristic[3] = 1;
		characteristic[4] = 1;
		icon = l;
	}
	public pawn(){
		
	}
	boolean logic(int IntfromX,int IntfromY,int InttoX,int InttoY){
		
		space s= new space();
		boolean output= false;
		//move 1 block
		if((InttoX - IntfromX == 1)&&(board.board[InttoX][InttoY].icon==s.s)&&board.board[IntfromX][IntfromY].icon=="♟"&&(Math.abs(InttoY - IntfromY) ==0)){
			if(((board.board[IntfromX][IntfromY].characteristic[2]==0)&&(board.board[InttoX][InttoY].characteristic[2]==0))||((board.board[IntfromX][IntfromY].characteristic[2]==1)&&(board.board[InttoX][InttoY].characteristic[2]==1))){
            }else{
            	output =true;                                
            }
		}
		//eat 1 block
        if((IntfromX -InttoX  == 1)&&(board.board[InttoX][InttoY].icon==s.s)&&board.board[IntfromX][IntfromY].icon=="♙"&&(Math.abs(InttoY - IntfromY) ==1)){
            if(((board.board[IntfromX][IntfromY].characteristic[2]==0)&&(board.board[InttoX][InttoY].characteristic[2] ==0))||((board.board[IntfromX][IntfromY].characteristic[2]==1)&&(board.board[InttoX][InttoY].characteristic[2]==1))){
            }else{
            	output =true;                                
            }
        }
        //to 4 or 5
        if(((((InttoX == 3) && (IntfromX <3) && (board.board[IntfromX][IntfromY].icon=="♟"))||((InttoX == 4) && (IntfromX >4) && (board.board[IntfromX][IntfromY].icon=="♙")))&&(board.board[InttoX][InttoY].icon==s.s))&&(Math.abs(InttoY - IntfromY) ==0)){
        	if(((board.board[IntfromX][IntfromY].characteristic[2]==0)&&(board.board[InttoX][InttoY].characteristic[2]==0))||((board.board[IntfromX][IntfromY].characteristic[2]==1)&&(board.board[InttoX][InttoY].characteristic[2]==1))){
        	}else{
        		output =true;
        	}
        }	
        //left->right
        if( (Math.abs(InttoY - IntfromY) ==1)&&(board.board[InttoX][InttoY].icon != s.s)){
        	System.out.print(board.board[InttoX][InttoY]);
        		if(((board.board[IntfromX][IntfromY].characteristic[2]==0)&&(board.board[InttoX][InttoY].characteristic[2]==0))||((board.board[IntfromX][IntfromY].characteristic[2]==1)&&(board.board[InttoX][InttoY].characteristic[2]==1))){
        		}else{
        			output =true;
        	}
        }
        else{
	
	}
		
		return output;		
	}
}
