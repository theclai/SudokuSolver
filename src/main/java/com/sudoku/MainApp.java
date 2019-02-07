/**
 * TMU Inc.
 * Copyright (c) 2019 All Rights Reserved.
 *
 * @author Faisal_RM754
 * @version $Id: MainApp.java, v 0.1 20190207 11:10 Faisal_RM754 Exp $$
 */

package com.sudoku;

public class MainApp {

    public static void main(String[] args){

        int[][] board = {
                {0,0,0,0,0,7,1,0,5},
                {7,0,0,0,0,5,0,8,0},
                {0,0,0,0,1,0,0,7,3},
                {0,6,0,0,0,0,3,2,1},
                {1,0,0,5,4,2,0,0,8},
                {2,8,7,0,0,0,0,4,0},
                {9,3,0,0,7,0,0,0,0},
                {0,7,0,3,0,0,0,0,2},
                {5,0,6,8,0,0,0,0,0}};

        Sudoku sudoku = new Sudoku(board);
        sudoku.ShowBeforeSolve(board);
        sudoku.Solve();
        sudoku.Show();
    }
}
