package com.chess.chess;

import com.chessGame.chessTranslator;
import com.chessGame.grid;

public class knight extends chess{
	public knight(){
		if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
		}
		else{
			if((((chessTranslator.InttoX == chessTranslator.IntfromX+2 && chessTranslator.InttoY== chessTranslator.IntfromY+1)||(chessTranslator.InttoX == chessTranslator.IntfromX+2 && chessTranslator.InttoY== chessTranslator.IntfromY-1))||
				((chessTranslator.InttoX == chessTranslator.IntfromX-2 && chessTranslator.InttoY== chessTranslator.IntfromY+1)||(chessTranslator.InttoX == chessTranslator.IntfromX-2 && chessTranslator.InttoY== chessTranslator.IntfromY-1)))||
				(((chessTranslator.InttoX == chessTranslator.IntfromX+1 && chessTranslator.InttoY== chessTranslator.IntfromY+2)||(chessTranslator.InttoX == chessTranslator.IntfromX+1 && chessTranslator.InttoY== chessTranslator.IntfromY-2))||
				((chessTranslator.InttoX == chessTranslator.IntfromX-1 && chessTranslator.InttoY== chessTranslator.IntfromY+2)||(chessTranslator.InttoX == chessTranslator.IntfromX-1 && chessTranslator.InttoY== chessTranslator.IntfromY-2)))){
				check =1;
			}
			else{
				check =0;
			}
		}
	}
}
