package com.company.SearchingAlgorithms.Assignments.BinarySearch.Easy;

/*
//https://leetcode.com/problems/check-if-n-and-its-double-exist/

Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]


Example 1:
Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.

Example 2:
Input: arr = [7,1,14,11]
Output: true
Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.

Example 3:
Input: arr = [3,1,7,11]
Output: false
Explanation: In this case does not exist N and M, such that N = 2 * M.


Constraints:

2 <= arr.length <= 500
-10^3 <= arr[i] <= 10^3
*/

import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            int target = 2 * arr[i];
            if(binarySearch(arr,i,target) == target) return true;
        }
        return false;
    }

    public static int binarySearch(int[] arr,int i,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start)/2;
            if(i == mid){
                start = mid + 1;
                continue;
            }
            if(arr[mid] == target){
                return arr[mid];
            }
            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
