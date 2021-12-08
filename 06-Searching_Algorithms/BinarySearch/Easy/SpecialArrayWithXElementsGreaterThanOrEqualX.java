package com.company.SearchingAlgorithms.Assignments.BinarySearch.Easy;

/*
//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

You are given an array nums of non-negative integers. nums is considered special if there exists a number x
such that there are exactly x numbers in nums that are greater than or equal to x.

Notice that x does not have to be an element in nums.

Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.


Example 1:
Input: nums = [3,5]
Output: 2
Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.

Example 2:
Input: nums = [0,0]
Output: -1
Explanation: No numbers fit the criteria for x.
If x = 0, there should be 0 numbers >= x, but there are 2.
If x = 1, there should be 1 number >= x, but there are 0.
If x = 2, there should be 2 numbers >= x, but there are 0.
x cannot be greater since there are only 2 numbers in nums.

Example 3:
Input: nums = [0,4,3,0,4]
Output: 3
Explanation: There are 3 values that are greater than or equal to 3.

Example 4:
Input: nums = [3,6,7,7,0]
Output: -1


Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 1000
*/

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0;i<=nums.length;i++){
            if(i == (nums.length - binarySearch(nums,i))){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[] , int target){

        int start = 0;
        int end = arr.length-1;
        while(start <= end){

            int mid = start + (end - start)/2;
            if(arr[mid] >= target){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
