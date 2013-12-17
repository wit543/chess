package com.newchess;



public class bishop extends chessPieces {
	public bishop(){
		
	}
	public bishop(int i, int j, int k, String l) {
		characteristic[0] = i;
		characteristic[1] = j;
		characteristic[2] = k;
		characteristic[3] = 3;
		characteristic[4] = 3;
		icon = l;
	}
	boolean logic(int IntfromX,int IntfromY,int InttoX,int InttoY){
		space s= new space();
		boolean output= false;
		if((Math.abs(IntfromX-IntfromY)==Math.abs(InttoX-InttoY))||(Math.abs(IntfromX+IntfromY)==Math.abs(InttoX+InttoY))){
			output =false;
			int countX =(InttoX-IntfromX);	
			int count = 0;
			String[] inbetween =  {s.s,s.s,s.s,s.s,s.s,s.s,s.s,s.s};
			if((InttoX-IntfromX<0)&&(InttoY-IntfromY<0)){
				while(count < Math.abs(countX)){
					count ++;
					inbetween[count] = board.board[IntfromX-count][IntfromY-count].icon;
				}	
			}
			if((InttoX-IntfromX<0)&&(InttoY-IntfromY>0)){
				while(count < Math.abs(countX)){
					count ++;
					inbetween[count] = board.board[IntfromX-count][IntfromY+count].icon;
				}	
			}
			if((InttoX-IntfromX>0)&&(InttoY-IntfromY<0)){
				while(count <countX){
					count ++;
					inbetween[count] = board.board[IntfromX+count][IntfromY-count].icon;
				}	
			}
			if((InttoX-IntfromX>0)&&(InttoY-IntfromY>0)){
				while(count <countX){
					count ++;
					inbetween[count] = board.board[IntfromX+count][IntfromY+count].icon;
				}	
			}
			for(int i=0;i<8;i++){
				if(((board.board[IntfromX][IntfromY].characteristic[2]==0)&&(board.board[InttoX][InttoY].characteristic[2]==0))||((board.board[IntfromX][IntfromY].characteristic[2]==1)&&(board.board[InttoX][InttoY].characteristic[2]==1))){
				}else{
				if(inbetween[i]== s.s && inbetween[i]==board.board[InttoX][InttoY].icon){			
					output =true;						
				}
				if(inbetween[i]!= s.s){;
					if(inbetween[i] == board.board[InttoX][InttoY].icon){
						output =true;
						break;
						}						
					}
				}				
			}	
		}
		return output;
	}
}
