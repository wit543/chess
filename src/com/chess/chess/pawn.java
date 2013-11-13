package com.chess.chess;

import com.chessGame.chessTranslator;
import com.chessGame.grid;

public class pawn extends chess {
	public  pawn(){
		if((chessTranslator.InttoX - chessTranslator.IntfromX == 1)&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]==space)&&grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]=="♟"&&(Math.abs(chessTranslator.InttoY - chessTranslator.IntfromY) ==0)){
			if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
            }else{
            	check =1;                                
            }
		}
        if((chessTranslator.IntfromX -chessTranslator.InttoX  == 1)&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]==space)&&grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]=="♙"&&(Math.abs(chessTranslator.InttoY - chessTranslator.IntfromY) ==1)){
            if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
            }else{
            	check =1;                                
            }
        }
        if( (((chessTranslator.InttoX == 3) && (chessTranslator.IntfromX <3) && (grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]=="♟"))||((chessTranslator.InttoX == 4) && (chessTranslator.IntfromX >4) && (grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]=="♙")))&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]==space)){
        	if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
        	}else{
        		check =1;
        	}
        }	
        if( (Math.abs(chessTranslator.InttoY - chessTranslator.IntfromY) ==1)&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY] != space)){
        	System.out.print(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]);
        		if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
        		}else{
        			check =1;
        	}
        }
        if( (Math.abs(chessTranslator.InttoY - chessTranslator.IntfromY) ==1)&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY] != space)){
        	System.out.print(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]);
        		if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
        		}else{
        			check =1;
        	}
        }
	else{
	
	}
}
}
