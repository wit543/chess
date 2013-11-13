package com.chessGame;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class render {
	public static void pagerefresh() throws FileNotFoundException, UnsupportedEncodingException{
       System.out.println("  ╔══════════╗");    
       System.out.println("8 ║ "+grid.gridlayout[7][0]+grid.gridlayout[7][1]+grid.gridlayout[7][2]+grid.gridlayout[7][3]+grid.gridlayout[7][4]+grid.gridlayout[7][5]+grid.gridlayout[7][6]+grid.gridlayout[7][7]);     
       System.out.println("7 ║ "+grid.gridlayout[6][0]+grid.gridlayout[6][1]+grid.gridlayout[6][2]+grid.gridlayout[6][3]+grid.gridlayout[6][4]+grid.gridlayout[6][5]+grid.gridlayout[6][6]+grid.gridlayout[6][7]);     
       System.out.println("6 ║ "+grid.gridlayout[5][0]+grid.gridlayout[5][1]+grid.gridlayout[5][2]+grid.gridlayout[5][3]+grid.gridlayout[5][4]+grid.gridlayout[5][5]+grid.gridlayout[5][6]+grid.gridlayout[5][7]);     
       System.out.println("5 ║ "+grid.gridlayout[4][0]+grid.gridlayout[4][1]+grid.gridlayout[4][2]+grid.gridlayout[4][3]+grid.gridlayout[4][4]+grid.gridlayout[4][5]+grid.gridlayout[4][6]+grid.gridlayout[4][7]);     
       System.out.println("4 ║ "+grid.gridlayout[3][0]+grid.gridlayout[3][1]+grid.gridlayout[3][2]+grid.gridlayout[3][3]+grid.gridlayout[3][4]+grid.gridlayout[3][5]+grid.gridlayout[3][6]+grid.gridlayout[3][7]);     
       System.out.println("3 ║ "+grid.gridlayout[2][0]+grid.gridlayout[2][1]+grid.gridlayout[2][2]+grid.gridlayout[2][3]+grid.gridlayout[2][4]+grid.gridlayout[2][5]+grid.gridlayout[2][6]+grid.gridlayout[2][7]);     
       System.out.println("2 ║ "+grid.gridlayout[1][0]+grid.gridlayout[1][1]+grid.gridlayout[1][2]+grid.gridlayout[1][3]+grid.gridlayout[1][4]+grid.gridlayout[1][5]+grid.gridlayout[1][6]+grid.gridlayout[1][7]);     
       System.out.println("1 ║ "+grid.gridlayout[0][0]+grid.gridlayout[0][1]+grid.gridlayout[0][2]+grid.gridlayout[0][3]+grid.gridlayout[0][4]+grid.gridlayout[0][5]+grid.gridlayout[0][6]+grid.gridlayout[0][7]);     
       System.out.println("  ╚══════════╝");    
       System.out.println("     A B C D E F G H");     


           
	}
}
