package com.euler;

public class Problem15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int size = 20;
	size++;
	long[][] grid = new long[size][size];
	for (int row = size - 1; row >= 0; row--) {
	    for (int column = size - 1; column >= 0; column--) {
		if (row == size - 1 && column == size - 1) {
		    grid[row][column] = 0;
		} else if (row == size - 1 || column == size - 1) {
		    grid[row][column] = 1;
		} else {
		    grid[row][column] = grid[row + 1][column]
			    + grid[row][column + 1];
		}
	    }
	}
	System.out.println("Result = "+grid[0][0]);
    }

}
