package com.chess.chess;

import com.chessGame.chessTranslator;
import com.chessGame.grid;

public class bishop extends chess{
	public bishop(){
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
	}


}
