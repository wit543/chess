package com.chessGame;

import java.io.IOException;

import com.chess.chess.chess;
public class main {
	public static void main(String[] args) throws IOException{
		grid.gridreset();
		render.pagerefresh();
		while(1>0){
		chessTranslator.StringToCode(chessInput.keyboardInString());
		if(check.chessCheck() == 1){
			chessMove.move();			
			render.pagerefresh();
			check.checkWinner();
				if(chess.whiteDie == 0){
					System.out.println("WINNER IS BLACK");
					break;
				}
				if(chess.blackDie == 0){
					System.out.println("WINNER IS WHITE");
					break;
				}
			}
		else{
			System.out.println("invalid move");
		}		
		}
	}
}
