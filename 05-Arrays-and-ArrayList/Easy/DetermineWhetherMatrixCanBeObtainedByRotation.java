package com.company.Arrays_and_ArrayList.Assignment.Easy;

/*
//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

Example 1:

Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:


Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:


Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.


Constraints:

n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.
*/

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat  = {{0,1},{1,1}};
        int[][] target  = {{1,0},{0,1}};
        System.out.println(findRotation(mat,target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int[][] res = new int[n][n];
        //90 rotation
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                res[i][j] = mat[n-1-j][i];
            }
        }

        //180 rotation
        int[][] res2 = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                res2[i][j] = res[n-1-j][i];
            }
        }

        //270 rotation
        int[][] res3 = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                res3[i][j] = res2[n-1-j][i];
            }
        }
        if(Arrays.deepEquals(target,res) ||Arrays.deepEquals(target,res2) ||Arrays.deepEquals(target,res3) ||Arrays.deepEquals(target,mat)){
            return true;
        }
        return false;
    }
}
