package com.company.Arrays_and_ArrayList.Assignment.Medium;

/*
//https://leetcode.com/problems/spiral-matrix-iii/

You start at the cell (rStart, cStart) of an rows x cols grid facing east. The northwest corner is at the first row and column in the grid, and the southeast corner is at the last row and column.
You will walk in a clockwise spiral shape to visit every position in this grid. Whenever you move outside the grid's boundary, we continue our walk outside the grid (but may return to the grid boundary later.). Eventually, we reach all rows * cols spaces of the grid.
Return an array of coordinates representing the positions of the grid in the order you visited them.

Example 1:
Input: rows = 1, cols = 4, rStart = 0, cStart = 0
Output: [[0,0],[0,1],[0,2],[0,3]]

Example 2:
Input: rows = 5, cols = 6, rStart = 1, cStart = 4
Output: [[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]


Constraints:
1 <= rows, cols <= 100
0 <= rStart < rows
0 <= cStart < cols

*/

import java.util.Arrays;

public class SprialMatrix3 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;
        int rStart = 1;
        int cStart = 4;
        int[][] matrix = new int[rows*cols][2];
        spiralMatrixIII(matrix,rows,cols,rStart,cStart);
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]));
        }
    }
    public static int[][] spiralMatrixIII(int[][] matrix,int rows, int cols, int rStart, int cStart) {
        int rEnd = rStart + 1;
        int cEnd = cStart + 1;
        matrix[0] = new int[]{rStart, cStart};
        int count = 1;
        while (cStart >= 0 || cEnd < cols || rStart >= 0 || rEnd < rows) {

            //right
            for (int i = cStart + 1; i <= cEnd; i++) {
                if (rStart >= 0 && i < cols && i >= 0) {
                    matrix[count] = new int[]{rStart, i};
                    count++;
                }
            }

            //down
            for (int i = rStart + 1; i <= rEnd; i++) {
                if (cEnd < cols && i < rows && i >= 0) {
                    matrix[count] = new int[]{i, cEnd};
                    count++;
                }
            }
            cStart--;
            rStart--;

            //left
            for (int i = cEnd - 1; i >= cStart; i--) {
                if (rEnd < rows && i >= 0 && i < cols) {
                    matrix[count] = new int[]{rEnd, i};
                    count++;
                }
            }

            //up
            for (int i = rEnd - 1; i >= rStart; i--) {
                if (cStart >= 0 && i >= 0 && i < rows) {
                    matrix[count] = new int[]{i, cStart};
                    count++;
                }
            }

            rEnd++;
            cEnd++;
        }
        return matrix;
    }
}
