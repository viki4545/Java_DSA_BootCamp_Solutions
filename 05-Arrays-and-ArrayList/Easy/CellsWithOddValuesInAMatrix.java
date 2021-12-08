package com.company.Arrays_and_ArrayList.Assignment.Easy;

/*
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices

Example 1:

Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
Example 2:


Input: m = 2, n = 2, indices = [[1,1],[0,0]]
Output: 0
Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.


Constraints:

1 <= m, n <= 50
1 <= indices.length <= 100
0 <= ri < m
0 <= ci < n


Follow up: Could you solve this in O(n + m + indices.length) time with only O(n + m) extra space?
*/

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for(int i = 0;i<indices.length;i++){
            int r = indices[i][0];
            int c = indices[i][1];
            for(int j = 0;j<m;j++){
                matrix[j][c]++;
            }
            for(int k = 0;k<n;k++){
                matrix[r][k]++;
            }
        }
        int count = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if((matrix[i][j])%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
