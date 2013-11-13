package com.chessGame;

import com.chess.chess.chess;

public class chessMove {
	public static void move(){
		String chessmove = grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY];		
		grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY] = chessmove;
		grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY] = chess.space;
	}
}
