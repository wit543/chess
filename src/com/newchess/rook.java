package com.newchess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class rook extends chessPieces {

	public rook(){
		
	}
	public rook(int i, int j, int k, String l) {
		characteristic[0] = i;
		characteristic[1] = j;
		characteristic[2] = k;
		characteristic[3] = 2;
		characteristic[4] = 5;
		icon = l;
	}
	boolean logic(int IntfromX,int IntfromY,int InttoX,int InttoY){
		boolean output=false;
		space s = new space();
		if(IntfromX==InttoX || IntfromY==InttoY){
			int x= InttoX-IntfromX;
			int y= InttoY-IntfromY;
			List<String> black = new ArrayList<String>(Arrays.asList("♜","♞","♝","♛","♚","♟"));
			List<String> white = new ArrayList<String>(Arrays.asList("♖","♘","♗","♕","♔","♙"));
			String[] inbetween =  {s.s,s.s,s.s,s.s,s.s,s.s,s.s,s.s};
			int count = 0;
			if(x>0){
				while(count <Math.abs(x)){
					count ++;
					inbetween[count] = board.board[IntfromX+count][IntfromY].icon;
				}	
			}
			if(x<0){
				while(count <Math.abs(x)){
					count ++;
					inbetween[count] = board.board[IntfromX-count][IntfromY].icon;
				}	
			}
			if(y>0){
				while(count <Math.abs(y)){
					count ++;
					inbetween[count] = board.board[IntfromX][IntfromY+count].icon;
				}	
			}
			if(y<0){
					while(count <Math.abs(y)){
					count ++;
					inbetween[count] = board.board[IntfromX][IntfromY-count].icon;
				}	
			}
			for(int i=1;i<8;i++){
				if(((board.board[IntfromX][IntfromY].characteristic[2]==0)&&(board.board[InttoX][InttoY].characteristic[2]==0))||((board.board[IntfromX][IntfromY].characteristic[2]==1)&&(board.board[InttoX][InttoY].characteristic[2]==1))){
				}else{				
					int h=0;
					int d=0;
					for (d=0;d<8;d++){
						if(white.contains(inbetween[d])||black.contains(inbetween[d])){
							h++;
						}
					}
					if(inbetween[i]== s.s && inbetween[i]==board.board[InttoX][InttoY].icon &&h==0){
						for (d=0;d<8;d++){
							if(white.contains(inbetween[d])||black.contains(inbetween[d])){
								h++;
							}
						}
						output =true;
					}
					if(inbetween[i]!= s.s){
						for (d=0;d<8;d++){
							if(white.contains(inbetween[d])||black.contains(inbetween[d])){
								h++;
							}
						}
						if((inbetween[i] == board.board[InttoX][InttoY].icon)){				
							if((h==Math.abs(y)+1||h==Math.abs(x)+1)&&(board.board[InttoX][InttoY].icon!= s.s)){
										output =true;
									}
							}
						}
						break;
					}				
				}
			}
		return output;
	}

}
