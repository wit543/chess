package com.newchess;

public class Render {
	
	void render(){
			System.out.println("  ╔══════════════════╗");  
			System.out.println("8 ║ "+board.board[7][0].icon+" "+board.board[7][1].icon+" "+board.board[7][2].icon+" "+board.board[7][3].icon+" "+board.board[7][4].icon+" "+board.board[7][5].icon+" "+board.board[7][6].icon+" "+board.board[7][7].icon+" ║");
			System.out.println("7 ║ "+board.board[6][0].icon+" "+board.board[6][1].icon+" "+board.board[6][2].icon+" "+board.board[6][3].icon+" "+board.board[6][4].icon+" "+board.board[6][5].icon+" "+board.board[6][6].icon+" "+board.board[6][7].icon+" ║");
			System.out.println("6 ║ "+board.board[5][0].icon+" "+board.board[5][1].icon+" "+board.board[5][2].icon+" "+board.board[5][3].icon+" "+board.board[5][4].icon+" "+board.board[5][5].icon+" "+board.board[5][6].icon+" "+board.board[5][7].icon+" ║");
			System.out.println("5 ║ "+board.board[4][0].icon+" "+board.board[4][1].icon+" "+board.board[4][2].icon+" "+board.board[4][3].icon+" "+board.board[4][4].icon+" "+board.board[4][5].icon+" "+board.board[4][6].icon+" "+board.board[4][7].icon+" ║");
			System.out.println("4 ║ "+board.board[3][0].icon+" "+board.board[3][1].icon+" "+board.board[3][2].icon+" "+board.board[3][3].icon+" "+board.board[3][4].icon+" "+board.board[3][5].icon+" "+board.board[3][6].icon+" "+board.board[3][7].icon+" ║");
			System.out.println("3 ║ "+board.board[2][0].icon+" "+board.board[2][1].icon+" "+board.board[2][2].icon+" "+board.board[2][3].icon+" "+board.board[2][4].icon+" "+board.board[2][5].icon+" "+board.board[2][6].icon+" "+board.board[2][7].icon+" ║");
			System.out.println("2 ║ "+board.board[1][0].icon+" "+board.board[1][1].icon+" "+board.board[1][2].icon+" "+board.board[1][3].icon+" "+board.board[1][4].icon+" "+board.board[1][5].icon+" "+board.board[1][6].icon+" "+board.board[1][7].icon+" ║");
			System.out.println("1 ║ "+board.board[0][0].icon+" "+board.board[0][1].icon+" "+board.board[0][2].icon+" "+board.board[0][3].icon+" "+board.board[0][4].icon+" "+board.board[0][5].icon+" "+board.board[0][6].icon+" "+board.board[0][7].icon+" ║");
			System.out.println("  ╚══════════════════╝");    
			System.out.println("    A B C D E F G H");     

		
	}
	
}
