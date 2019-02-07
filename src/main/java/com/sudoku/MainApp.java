/**
 * TMU Inc.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.sudoku;

/**
 * @author Faisal_RM754
 * @version $Id: MainApp.java, v 0.1 20190207 11:10 Faisal_RM754 Exp $$
 */
public class MainApp {

    public static void main(String[] args){

        int[][] board = {
                {0,1,0,0,0,0,0,0,3},
                {0,0,7,0,9,5,0,6,0},
                {0,0,0,3,0,0,5,1,7},
                {0,9,3,0,0,0,0,7,2},
                {0,0,0,2,1,3,0,0,0},
                {5,2,0,0,0,0,6,3,0},
                {4,3,9,0,0,7,0,0,0},
                {0,5,0,4,2,0,3,0,0},
                {6,0,0,0,0,0,0,9,0}};

        Sudoku sudoku = new Sudoku(board);
        sudoku.ShowBeforeSolve(board);
        sudoku.Solve();
        sudoku.Show();
    }
}
