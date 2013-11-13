package com.chessGame;

import com.chess.chess.bishop;
import com.chess.chess.chess;
import com.chess.chess.king;
import com.chess.chess.knight;
import com.chess.chess.pawn;
import com.chess.chess.queen;
import com.chess.chess.rook;

public class check extends chess{
	public static int chessCheck(){
		chess c[] = new chess[6];
		c[0] = new bishop();
		c[1] = new rook();
		c[2] = new king();
		c[3] = new knight();
		c[4] = new queen();
		c[5] = new pawn();
		
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== rook_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== rook_white){
			c[0].bishop();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== bishop_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== bishop_white){
			c[1].rook();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== king_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== king_white){
			c[2].king();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== knight_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== knight_white){
			c[3].knight();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== queen_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== queen_white){
			c[4].queen();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== "♟" ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== "♙"){
			c[5].pawn();
		}
                else{
                    check =0;
                }
		return check;
	}
	public static void checkWinner(){
		whiteDie =0;
		blackDie =0;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(grid.gridlayout[i][j]=="♔"){
					whiteDie++;
				}
			}
		}
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(grid.gridlayout[i][j]=="♚"){
					blackDie++;
				}
			}
		}
	}
}
