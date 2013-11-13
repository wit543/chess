package com.chess.chess;

import com.chessGame.chessTranslator;
import com.chessGame.grid;

public class queen extends chess {
	public queen(){
		if((Math.abs(chessTranslator.IntfromX-chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX-chessTranslator.InttoY))||(Math.abs(chessTranslator.IntfromX+chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX+chessTranslator.InttoY))){
			check =0;
			int countX =(chessTranslator.InttoX-chessTranslator.IntfromX);	
			int count = 0;
			String[] inbetween =  {space,space,space,space,space,space,space,space};
			if((chessTranslator.InttoX-chessTranslator.IntfromX<0)&&(chessTranslator.InttoY-chessTranslator.IntfromY<0)){
				while(count < Math.abs(countX)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX-count][chessTranslator.IntfromY-count];
				}	
			}
			if((chessTranslator.InttoX-chessTranslator.IntfromX<0)&&(chessTranslator.InttoY-chessTranslator.IntfromY>0)){
				while(count < Math.abs(countX)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX-count][chessTranslator.IntfromY+count];
				}	
			}
			if((chessTranslator.InttoX-chessTranslator.IntfromX>0)&&(chessTranslator.InttoY-chessTranslator.IntfromY<0)){
				while(count <countX){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX+count][chessTranslator.IntfromY-count];
				}	
			}
			if((chessTranslator.InttoX-chessTranslator.IntfromX>0)&&(chessTranslator.InttoY-chessTranslator.IntfromY>0)){
				while(count <countX){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX+count][chessTranslator.IntfromY+count];
				}	
			}
			for(int i=0;i<8;i++){
				if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
				}else{
				if(inbetween[i]== space && inbetween[i]==grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]){			
					check =1;						
				}
				if(inbetween[i]!= space){;
					if(inbetween[i] == grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]){
						check =1;
						break;
						}						
					}
				}				
			}	
		}
		if(chessTranslator.IntfromX==chessTranslator.InttoX || chessTranslator.IntfromY==chessTranslator.InttoY){
			int x= chessTranslator.InttoX-chessTranslator.IntfromX;
			int y= chessTranslator.InttoY-chessTranslator.IntfromY;
			String[] inbetween =  {space,space,space,space,space,space,space,space};
			int count = 0;
			if(x>0){
				while(count <Math.abs(x)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX+count][chessTranslator.IntfromY];
				}	
			}
			if(x<0){
				while(count <Math.abs(x)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX-count][chessTranslator.IntfromY];
				}	
			}
			if(y>0){
				while(count <Math.abs(y)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY+count];
				}	
			}
			if(y<0){
					while(count <Math.abs(y)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY-count];
				}	
			}
			for(int i=1;i<8;i++){
				if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
				}else{				
					int h=0;
					int d=0;
					for (d=0;d<8;d++){
						if(white.contains(inbetween[d])||black.contains(inbetween[d])){
							h++;
						}
					}
					if(inbetween[i]== space && inbetween[i]==grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY] &&h==0){
						for (d=0;d<8;d++){
							if(white.contains(inbetween[d])||black.contains(inbetween[d])){
								h++;
							}
						}
						check =1;
					}
					if(inbetween[i]!= space){
						for (d=0;d<8;d++){
							if(white.contains(inbetween[d])||black.contains(inbetween[d])){
								h++;
							}
						}
						if((inbetween[i] == grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])){				
							if((h==Math.abs(y)+1||h==Math.abs(x)+1)&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]!= space)){
										check =1;
									}
							}
					}
					break;
				}				
			}
		}
	}
}
