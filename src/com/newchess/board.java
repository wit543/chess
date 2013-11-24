package com.newchess;

public class board extends chessPieces {
	chessPieces pw1 = new pawn();
	chessPieces pw2 = new pawn();
	chessPieces pw3 = new pawn();
	chessPieces pw4 = new pawn();
	chessPieces pw5 = new pawn();
	chessPieces pw6 = new pawn();
	chessPieces pw7 = new pawn();
	chessPieces pw8 = new pawn();
	chessPieces rw1 = new rook();
	chessPieces rw2 = new rook();
	chessPieces bw1 = new bishop();
	chessPieces bw2 = new bishop();
	chessPieces kw1 = new knight();
	chessPieces kw2 = new knight();
	chessPieces qw1 = new queen();
	chessPieces kingw1 = new king();
	
	chessPieces pb1 = new pawn();
	chessPieces pb2 = new pawn();
	chessPieces pb3 = new pawn();
	chessPieces pb4 = new pawn();
	chessPieces pb5 = new pawn();
	chessPieces pb6 = new pawn();
	chessPieces pb7 = new pawn();
	chessPieces pb8 = new pawn();
	chessPieces rb1 = new rook();
	chessPieces rb2 = new rook();
	chessPieces bb1 = new bishop();
	chessPieces bb2 = new bishop();
	chessPieces kb1 = new knight();
	chessPieces kb2 = new knight();
	chessPieces qb1 = new queen();
	chessPieces kingb1 = new king();
	
	
	board[][] boardGrid = new board[8][8];
	void boardinitialize() {
		
		pb1.setcharacteristic(1,0,0);
		pb2.setcharacteristic(1,1,0);
		pb3.setcharacteristic(1,2,0);
		pb4.setcharacteristic(1,3,0);
		pb5.setcharacteristic(1,4,0);
		pb6.setcharacteristic(1,5,0);
		pb7.setcharacteristic(1,6,0);
		pb8.setcharacteristic(1,7,0);
		rb1.setcharacteristic(0,0,0);
		rb2.setcharacteristic(0,7,0);
		kb1.setcharacteristic(0,1,0);
		kb2.setcharacteristic(0,6,0);
		bb1.setcharacteristic(0,2,0);
		bb2.setcharacteristic(0,5,0);
		qb1.setcharacteristic(0,3,0);
		kingb1.setcharacteristic(0,4,0);
		
		pw1.setcharacteristic(6,0,1);
		pw2.setcharacteristic(6,1,1);
		pw3.setcharacteristic(6,2,1);
		pw4.setcharacteristic(6,3,1);
		pw5.setcharacteristic(6,4,1);
		pw6.setcharacteristic(6,5,1);
		pw7.setcharacteristic(6,6,1);
		pw8.setcharacteristic(6,7,1);
		rw1.setcharacteristic(7,0,1);
		rw2.setcharacteristic(7,7,1);
		kw1.setcharacteristic(7,1,1);
		kw2.setcharacteristic(7,6,1);
		bw1.setcharacteristic(7,2,1);
		bw2.setcharacteristic(7,5,1);
		qw1.setcharacteristic(7,3,1);
		kingw1.setcharacteristic(7,4,1);
	}
	int[] getPosition(){	
		int[] i = pw1.getcharacteristic();
 		System.out.println(i[0]);
 		System.out.println(i[1]);
		return pw1.getcharacteristic();
	}
	void setPosition(chessPieces p){
		
		boardGrid[p.characteristic[0]][p.characteristic[1]]= (board)p;
	}
	board[][] set(){
		/*boardGrid[0][0]=(board) rb1;
		boardGrid[0][1]=(board) kb1;
		boardGrid[0][2]=(board) bb1;
		boardGrid[0][3]=(board) qb1;
		boardGrid[0][4]=(board) kingb1;
		boardGrid[0][5]=(board) bb1;		
		boardGrid[0][6]=(board) kb1;
		boardGrid[0][7]=(board) rb1;
		boardGrid[1][0]=(board) pb1;
		boardGrid[1][1]=(board) pb2;
		boardGrid[1][2]=(board) pb3;
		boardGrid[1][3]=(board) pb4;		
		boardGrid[1][4]=(board) pb5;
		boardGrid[1][5]=(board) pb6;
		boardGrid[1][6]=(board) pb7;
		boardGrid[1][7]=(board) pb8;
		
		boardGrid[7][0]=(board) rw1;
		boardGrid[7][1]=(board) kw1;
		boardGrid[7][2]=(board) bw1;
		boardGrid[7][3]=(board) qw1;
		boardGrid[7][4]=(board) kingw1;
		boardGrid[7][5]=(board) bw1;		
		boardGrid[7][6]=(board) kw1;
		boardGrid[7][7]=(board) rw1;
		boardGrid[6][0]=(board) pw1;
		boardGrid[6][1]=(board) pw2;
		boardGrid[6][2]=(board) pw3;
		boardGrid[6][3]=(board) pw4;		
		boardGrid[6][4]=(board) pw5;
		boardGrid[6][5]=(board) pw6;
		boardGrid[6][6]=(board) pw7;
		boardGrid[6][7]=(board) pw8;*/
		
		return boardGrid;
	}
}
