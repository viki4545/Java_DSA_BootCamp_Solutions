package com.company.SearchingAlgorithms.Assignments.LinearSearch.Easy;

/*
//https://leetcode.com/problems/valid-perfect-square/

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.



Example 1:
Input: num = 16
Output: true

Example 2:
Input: num = 14
Output: false


Constraints:

1 <= num <= 2^31 - 1

*/

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    //Note: but in leetcode it is giving tle for some testcases.
    public static boolean isPerfectSquare(int num) {
        for(int i = 1;i<=num;i++){
            int t = i*i;
            if(num == t){
                return true;
            }
        }
        return false;
    }
}
