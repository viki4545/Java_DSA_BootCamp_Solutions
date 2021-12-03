package com.company.Arrays_and_ArrayList.Assignment.Easy;

import java.util.Arrays;
/*
//https://leetcode.com/problems/transpose-matrix/

Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109
*/

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(matrix);
        System.out.print("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]));
        }
        System.out.print("]");
    }
    public static int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] ans = new int[c][r];
        for(int i=0;i<r;i++){
            for(int j = 0;j<c;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
