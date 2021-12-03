package com.company.Arrays_and_ArrayList.Assignment.Medium;

/*
//https://leetcode.com/problems/spiral-matrix/

Given an m x n matrix, return all elements of the matrix in spiral order.


Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100

*/

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;
        int dir = -1;
        int tle = matrix.length*matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix.length == 0){
            return list;
        }
        while(tle != 0){
            dir = (dir+1)%4;
            if(dir == 0){
                for(int j = sc;j<=ec;j++){
                    list.add(matrix[sr][j]);
                    tle--;
                }sr++;
            }else if(dir == 1){
                for(int j = sr;j<=er;j++){
                    list.add(matrix[j][ec]);
                    tle--;
                }ec--;
            }else if(dir == 2){
                for(int j = ec;j>=sc;j--){
                    list.add(matrix[er][j]);
                    tle--;
                }er--;
            }else if(dir == 3){
                for(int j = er;j>=sr;j--){
                    list.add(matrix[j][sc]);
                    tle--;
                }sc++;
            }
        }
        return list;
    }
}
