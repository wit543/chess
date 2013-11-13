package com.chessGame;

public class chessTranslator {
	public static int IntfromX;
	public static int IntfromY;
	public static int InttoX;
	public static int InttoY;
	public static void StringToCode(String Input){
		String[] parts = Input.split(" ");
		String part1 = parts[0];
		String part2 = parts[1];
		String[] out1 = part1.split("/");
		String[] out2 = part2.split("/");
		String fromX = out1[0];
		String fromY= out1[1];
		String toX = out2[0];
		String toY = out2[1];
        IntfromY = 0;
		InttoY = 0;

                String[] out = {" ","a","b","c","d","e","f","g","h"};
		while(IntfromY <9){
                    IntfromY++;
                    if(fromY.equals(out[chessTranslator.IntfromY].toString())){
                        break;
                    }
		}
                while(InttoY <9){
			InttoY++;
			if(toY.equals(out[chessTranslator.InttoY].toString())){
                            break;
			}
		}
		IntfromX = Integer.parseInt(fromX);
		InttoX = Integer.parseInt(toX);
		IntfromX = IntfromX -1;
		IntfromY = IntfromY -1;
		InttoX = InttoX -1;
		InttoY = InttoY -1;
	}
}
