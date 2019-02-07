/**
 * TMU Inc.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.sudoku;

/**
 * @author Faisal_RM754
 * @version $Id: Sudoku.java, v 0.1 20190207 10:54 Faisal_RM754 Exp $$
 */
public class Sudoku {

    private int[][] board;
    public static final int EMPTY = 0; // empty cell
    public static final int SIZE = 9; // size of our Sudoku grids

    public Sudoku(int[][] board){

        this.board = new int[SIZE][SIZE];

        for (int i=0;i<SIZE;i++){
            for (int j=0;j<SIZE;j++){
                this.board[i][j] = board[i][j];
            }
        }
    }

    private boolean isValidRow(int row, int number){

        for(int i=0;i<SIZE;i++){
            if(board[row][i] == number){
                return true;
            }
        }

        return false;
    }

    private boolean isValidCol(int col, int number){

        for(int i=0;i<SIZE;i++){
            if(board[i][col] == number){
                return true;
            }
        }
        return false;
    }

    private boolean isSubGrid(int row, int col, int number){

        // find subGrid with 3x3
        int rowTmp = row - row % 3;
        int colTmp = col - col % 3;

        for(int i=rowTmp;i<rowTmp+3;i++){
            for (int j=colTmp;j<colTmp+3;j++){
                if(board[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isAllCheck(int row, int col, int number){

        return !isValidRow(row,number) && !isValidCol(col,number) && !isSubGrid(row, col, number);
    }

    public boolean Solve(){

        for (int i=0;i<SIZE;i++){
            for (int j=0;j<SIZE;j++){

                //check if empty
                if(board[i][j] == EMPTY){

                    for(int k=1;k<=SIZE;k++){

                        if(isAllCheck(i,j,k)){
                            board[i][j] = k;

                            if(Solve()){
                                return true;
                            }else {
                                board[i][j] = EMPTY;
                            }
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    public void ShowBeforeSolve(int[][] sudoku){

        System.out.println("=========================");
        System.out.println("       Problem");
        System.out.println("=========================");

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) // not first iteration
                System.out.println(); // print extra new-line each 3 iterations

            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0)
                    System.out.print(" "); // to print spaces between columns

                if (sudoku[i][j] == 0) {
                    System.out.print(" .");
                    continue; // since it's 0, continue with next iteration
                }

                System.out.print(" " + sudoku[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }

    public void Show(){

        System.out.println("=========================");
        System.out.println("       Solution");
        System.out.println("=========================");

        for (int i=0;i<SIZE;i++){

            if(i % 3 == 0 && i != 0)
                System.out.println();

            for (int j=0;j<SIZE;j++){
                if(j % 3 == 0)
                    System.out.print(" ");

                if(board[i][j] == 0){
                    System.out.print(" .");
                    continue;
                }

                System.out.print(" " + board[i][j]);
            }

            System.out.println();
        }
    }

}
