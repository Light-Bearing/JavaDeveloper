package org.skillbox.lesson5;

public class Main {

    public static void main(String[] args) {
	//Вариант 1
        String [][]ChessBoard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ChessBoard[j][i]= (char)((int)('A')+i)+String.valueOf(j+1);
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(ChessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
}
