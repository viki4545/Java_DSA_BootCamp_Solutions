package com.company.Arrays_and_ArrayList.Assignment.Medium;

/*
//https://leetcode.com/problems/spiral-matrix-ii/

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Example 1:
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

Example 2:
Input: n = 1
Output: [[1]]


Constraints:
1 <= n <= 20
*/

import java.util.ArrayList;
import java.util.Arrays;

public class SprialMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        generateMatrix(n);
    }
    public static void generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int startRow = 0;
        int startColumn = 0;
        int endRow = n-1;
        int endColumn = n-1;
        int count = 1;
        int dir = -1;
        int tle = n * n;
        while(count <= tle){
            dir = (dir+1)%4;
            if(dir == 0){
                for (int i = startColumn; i <= endColumn ; i++) {
                    matrix[startRow][i] = count;
                    count++;
                }
                if(count == tle){
                    break;
                }
                startRow++;
            }else if(dir == 1){
                for (int i = startRow; i <= endRow; i++) {
                    matrix[i][endColumn] = count;
                    count++;
                }
                if(count == tle){
                    break;
                }
                endColumn--;
            }else if(dir == 2){
                for (int i = endColumn; i >= startColumn ; i--) {
                    matrix[endRow][i] = count;
                    count++;
                }
                if(count == tle){
                    break;
                }
                endRow--;
            }else if(dir == 3){
                for (int i = endRow; i >= startRow ; i--) {
                    matrix[i][startColumn] = count;
                    count++;
                }
                if(count == tle){
                    break;
                }
                startColumn++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(Arrays.toString(matrix[i]));
        }
        System.out.print("]");
    }
}
