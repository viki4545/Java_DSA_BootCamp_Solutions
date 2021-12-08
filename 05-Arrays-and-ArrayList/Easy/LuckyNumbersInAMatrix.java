package com.company.Arrays_and_ArrayList.Assignment.Easy;

/*
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/

Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 4:

Input: matrix = [[3,6],[7,1],[5,2],[4,8]]
Output: []
Explanation: There is no lucky number.


Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(matrix));

    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        int[] rowMin = new int[m];
        int[] colMax = new int[n];
        Arrays.fill(rowMin,Integer.MAX_VALUE);
        for(int row = 0;row<matrix.length;row++){
            for(int col = 0;col<matrix[0].length;col++){
                rowMin[row] = Math.min(matrix[row][col],rowMin[row]);
                colMax[col] = Math.max(matrix[row][col],colMax[col]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(rowMin[i] == colMax[j]){
                    list.add(rowMin[i]);
                    break;
                }
            }
        }
        return list;
    }
}
