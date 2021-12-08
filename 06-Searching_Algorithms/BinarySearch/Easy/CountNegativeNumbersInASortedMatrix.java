package com.company.SearchingAlgorithms.Assignments.BinarySearch.Easy;

/*
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0

Example 3:
Input: grid = [[1,-1],[-1,-1]]
Output: 3

Example 4:
Input: grid = [[-1]]
Output: 1


Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100


Follow up: Could you find an O(n + m) solution?
*/

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int ans = 0;
        for(int i = 0;i<grid.length;i++){
            ans += checkNegative(grid[i]);
        }
        return ans;
    }
    public static int checkNegative(int[] row){
        int count = 0;
        int low = 0;
        int high = row.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(row[mid] >= 0){
                low = mid + 1;
            }else if(row[mid] < 0){
                count = count + high - mid + 1;
                high = mid -1;
            }
        }
        return count;
    }
}
