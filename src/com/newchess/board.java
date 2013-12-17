package com.newchess;

import java.io.IOException;

/*
 * IMPORTANT(MUST READ)
 * IF YOU CAN'T SEE THE CHESS
 * please UFT8 for encoding
 * eclipse: Windows > Preferences > General > Workspaces, set "Text file encoding" to "Other : UTF-8"
 * 
 * 
 * try but fail to not use static(use 1 static)
 * need to do list
 * update special move
 * check bug
 * game end
 * */


public class board {
	static chessPieces[][] board = new chessPieces[9][8];
	/*
    chessPieces pw1 = new pawn(6,0,1,"♟");
	chessPieces pw2 = new pawn(6,1,1,"♟");
	chessPieces pw3 = new pawn(6,2,1,"♟");
	chessPieces pw4 = new pawn(6,3,1,"♟");
	chessPieces pw5 = new pawn(6,4,1,"♟");
	chessPieces pw6 = new pawn(6,5,1,"♟");
	chessPieces pw7 = new pawn(6,6,1,"♟");
	chessPieces pw8 = new pawn(6,7,1,"♟");
	chessPieces rw1 = new rook(7,0,1,"♜");
	chessPieces rw2 = new rook(7,7,1,"♜");
	chessPieces bw1 = new bishop(7,1,1,"♝");
	chessPieces bw2 = new bishop(7,6,1,"♝");
	chessPieces kw1 = new knight(7,2,1,"♞");
	chessPieces kw2 = new knight(7,5,1,"♞");
	chessPieces qw1 = new queen(7,3,1,"♛");
	chessPieces kingw1 = new king(7,4,1,"♚");
	
	chessPieces pb1 = new pawn(1,0,0,"♙");
	chessPieces pb2 = new pawn(1,1,0,"♙");
	chessPieces pb3 = new pawn(1,2,0,"♙");
	chessPieces pb4 = new pawn(1,3,0,"♙");
	chessPieces pb5 = new pawn(1,4,0,"♙");
	chessPieces pb6 = new pawn(1,5,0,"♙");
	chessPieces pb7 = new pawn(1,6,0,"♙");
	chessPieces pb8 = new pawn(1,7,0,"♙");
	chessPieces rb1 = new rook(0,0,1,"♖");
	chessPieces rb2 = new rook(0,7,1,"♖");
	chessPieces bb1 = new bishop(0,1,0,"♗");
	chessPieces bb2 = new bishop(0,6,0,"♗");
	chessPieces kb1 = new knight(0,2,0,"♘");
	chessPieces kb2 = new knight(0,5,0,"♘");
	chessPieces qb1 = new queen(0,3,0,"♕");
	chessPieces kingb1 = new king(0,4,0,"♔");*/
	
	
	chessPieces pw1 = new pawn(1,0,1,"♟");
	chessPieces pw2 = new pawn(1,1,1,"♟");
	chessPieces pw3 = new pawn(1,2,1,"♟");
	chessPieces pw4 = new pawn(1,3,1,"♟");
	chessPieces pw5 = new pawn(1,4,1,"♟");
	chessPieces pw6 = new pawn(1,5,1,"♟");
	chessPieces pw7 = new pawn(1,6,1,"♟");
	chessPieces pw8 = new pawn(1,7,1,"♟");
	chessPieces rw1 = new rook(0,0,1,"♜");
	chessPieces rw2 = new rook(0,7,1,"♜");
	chessPieces bw1 = new bishop(0,1,1,"♝");
	chessPieces bw2 = new bishop(0,6,1,"♝");
	chessPieces kw1 = new knight(0,2,1,"♞");
	chessPieces kw2 = new knight(0,5,1,"♞");
	chessPieces qw1 = new queen(0,3,1,"♛");
	chessPieces kingw1 = new king(0,4,1,"♚");
	
	chessPieces pb1 = new pawn(6,0,0,"♙");
	chessPieces pb2 = new pawn(6,1,0,"♙");
	chessPieces pb3 = new pawn(6,2,0,"♙");
	chessPieces pb4 = new pawn(6,3,0,"♙");
	chessPieces pb5 = new pawn(6,4,0,"♙");
	chessPieces pb6 = new pawn(6,5,0,"♙");
	chessPieces pb7 = new pawn(6,6,0,"♙");
	chessPieces pb8 = new pawn(6,7,0,"♙");
	chessPieces rb1 = new rook(7,0,1,"♖");
	chessPieces rb2 = new rook(7,7,1,"♖");
	chessPieces bb1 = new bishop(7,1,0,"♗");
	chessPieces bb2 = new bishop(7,6,0,"♗");
	chessPieces kb1 = new knight(7,2,0,"♘");
	chessPieces kb2 = new knight(7,5,0,"♘");
	chessPieces qb1 = new queen(7,3,0,"♕");
	chessPieces kingb1 = new king(7,4,0,"♔");
	
	chessPieces white = new chessPieces();
	chessPieces black = new chessPieces();
	
	chessPieces s= new space();
	
	board[][] boardGrid = new board[8][8];
	void boardinitialize() {
		/*
        pb1.setcharacteristic(1,0,0);
		pb2.setcharacteristic(1,1,0);
		pb3.setcharacteristic(1,2,0);
		pb4.setcharacteristic(1,3,0);+
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
		kingw1.setcharacteristic(7,4,1);*/
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				board[i][j] =s;
			}
		}
                
                board[pw1.characteristic[0]][pw1.characteristic[1]] =pw1;
                board[pw2.characteristic[0]][pw2.characteristic[1]] =pw2;
                board[pw3.characteristic[0]][pw3.characteristic[1]] =pw3;
                board[pw4.characteristic[0]][pw4.characteristic[1]] =pw4;
                board[pw5.characteristic[0]][pw5.characteristic[1]] =pw5;
                board[pw6.characteristic[0]][pw6.characteristic[1]] =pw6;
                board[pw7.characteristic[0]][pw7.characteristic[1]] =pw7;
                board[pw8.characteristic[0]][pw8.characteristic[1]] =pw8;
                board[rw1.characteristic[0]][rw1.characteristic[1]] =rw1;
                board[rw2.characteristic[0]][rw2.characteristic[1]] =rw2;
                board[bw1.characteristic[0]][bw1.characteristic[1]] =bw1;
                board[bw2.characteristic[0]][bw2.characteristic[1]] =bw2;
                board[kw1.characteristic[0]][kw1.characteristic[1]] =kw1;
                board[kw2.characteristic[0]][kw2.characteristic[1]] =kw2;
                board[qw1.characteristic[0]][qw1.characteristic[1]] =qw1;
                board[kingw1.characteristic[0]][kingw1.characteristic[1]] =kingw1;
                
                board[pb1.characteristic[0]][pb1.characteristic[1]] =pb1;
                board[pb2.characteristic[0]][pb2.characteristic[1]] =pb2;
                board[pb3.characteristic[0]][pb3.characteristic[1]] =pb3;
                board[pb4.characteristic[0]][pb4.characteristic[1]] =pb4;
                board[pb5.characteristic[0]][pb5.characteristic[1]] =pb5;
                board[pb6.characteristic[0]][pb6.characteristic[1]] =pb6;
                board[pb7.characteristic[0]][pb7.characteristic[1]] =pb7;
                board[pb8.characteristic[0]][pb8.characteristic[1]] =pb8;
                board[rb1.characteristic[0]][rb1.characteristic[1]] =rb1;
                board[rb2.characteristic[0]][rb2.characteristic[1]] =rb2;
                board[bb1.characteristic[0]][bb1.characteristic[1]] =bb1;
                board[bb2.characteristic[0]][bb2.characteristic[1]] =bb2;
                board[kb1.characteristic[0]][kb1.characteristic[1]] =kb1;
                board[kb2.characteristic[0]][kb2.characteristic[1]] =kb2;
                board[qb1.characteristic[0]][qb1.characteristic[1]] =qb1;
                board[kingb1.characteristic[0]][kingb1.characteristic[1]] =kingb1;
                
	}
	int getPositionX(int Ix){	
		/*int[] i = pw1.getcharacteristic();
 		System.out.println(i[0]);
 		System.out.println(i[1]);*/
		return pw1.getcharacteristic(Ix);
	}
	void setPosition(chessPieces p){
		
		//boardGrid[p.characteristic[0]][p.characteristic[1]]= (board)p;
	}
	board[][] set(){
	/*
		boardGrid[0][0]=(board) rb1;
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
		boardGrid[6][7]=(board) pw8;
		*/
		return boardGrid;
	}
	void into(){
		System.out.println("introduction to chess game");
		System.out.println("==========================");
		System.out.println("fornat = fromX/fromY toX/toY");
		System.out.println("fromX/fromY\"space\"toX/toY");
		System.out.println("example 2/a 3/a");
	}
	public static void main(String[] args) throws IOException{
		board bo = new board();
		Render ren = new Render();
		Input i = new Input();
		logic l = new logic();
		move m = new move();
		translate t = new translate();
		
		bo.into();
		bo.boardinitialize();
		ren.render();
		int g=0;
		while(g<1){
			m.moveChess(l.test(t.StringToCode(i.getInput())));
			ren.render();
		}
			
		
	}
}
