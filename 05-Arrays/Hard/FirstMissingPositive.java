package com.company.Arrays_and_ArrayList.Assignment.Hard;

/*
//https://leetcode.com/problems/first-missing-positive/

Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.

Example 1:
Input: nums = [1,2,0]
Output: 3

Example 2:
Input: nums = [3,4,-1,1]

Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1


Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
*/

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        //step 1: mark the element which are out of range and manage the presence of 1
        boolean one = false;
        for(int i = 0;i<n;i++){
            if(nums[i] == 1){
                one = true;
            }
            if(nums[i] < 1 || nums[i] > n){
                nums[i] = 1;
            }
        }
        if(one == false) return 1;

        //step 2: map the element with index
        for(int i =0;i<n;i++){
            int idx = Math.abs(nums[i]);
            nums[idx-1] = -Math.abs(nums[idx-1]);
        }

        //step 3: find the missing positive numbers
        for(int i = 0;i<n;i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        return n+1;
    }
}
