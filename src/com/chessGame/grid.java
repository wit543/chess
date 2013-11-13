package com.chessGame;

import com.chess.chess.chess;

public class grid {
	public static String[][] gridlayout = new String[8][8];
	
	public static void gridreset(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				gridlayout[i][j] =chess.space;
			}
		}
		gridlayout[0][0] = chess.rook_black;
		gridlayout[0][1] = chess.knight_black;
		gridlayout[0][2] = chess.bishop_black;
		gridlayout[0][3] = chess.queen_black;
		gridlayout[0][4] = chess.king_black;
		gridlayout[0][5] = chess.bishop_black;
		gridlayout[0][6] = chess.knight_black;
		gridlayout[0][7] = chess.rook_black;
		gridlayout[1][0] = chess.pawn_black1;
		gridlayout[1][1] = chess.pawn_black2;
		gridlayout[1][2] = chess.pawn_black3;
		gridlayout[1][3] = chess.pawn_black4;
		gridlayout[1][4] = chess.pawn_black5;
		gridlayout[1][5] = chess.pawn_black6;
		gridlayout[1][6] = chess.pawn_black7;
		gridlayout[1][7] = chess.pawn_black8;
		
		
		gridlayout[7][0] = chess.rook_white;
		gridlayout[7][1] = chess.knight_white;
		gridlayout[7][2] = chess.bishop_white;
		gridlayout[7][3] = chess.queen_white;
		gridlayout[7][4] = chess.king_white;
		gridlayout[7][5] = chess.bishop_white;
		gridlayout[7][6] = chess.knight_white;
		gridlayout[7][7] = chess.rook_white;;
		gridlayout[6][0] = chess.pawn_white1;
		gridlayout[6][1] = chess.pawn_white2;
		gridlayout[6][2] = chess.pawn_white3;
		gridlayout[6][3] = chess.pawn_white4;
		gridlayout[6][4] = chess.pawn_white5;
		gridlayout[6][5] = chess.pawn_white6;
		gridlayout[6][6] = chess.pawn_white7;
		gridlayout[6][7] = chess.pawn_white8;
	}
}
