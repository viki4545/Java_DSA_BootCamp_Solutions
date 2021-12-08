package com.company.SearchingAlgorithms.Assignments.BinarySearch.Easy;

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
    public static boolean isPerfectSquare(int num) {
        if(num < 1){
            return false;
        }
        long start = 1;
        long end = num;
        while(start <= end){
            long mid = start + (end - start)/2;
            long t = mid * mid;
            if(t > num){
                end = mid -1;
            }else if(t < num){
                start = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
