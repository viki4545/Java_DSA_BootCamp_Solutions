package com.company.SearchingAlgorithms.Assignments.BinarySearch.Easy;

/*
//https://leetcode.com/problems/search-insert-position/

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.



Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Example 4:
Input: nums = [1,3,5,6], target = 0
Output: 0

Example 5:
Input: nums = [1], target = 0
Output: 0


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
*/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 1;
        int end = nums.length-1;

        //Basic testcases
        if(nums.length == 0 || target <= nums[0]){
            return 0;
        }
        if(target == nums[end]){
            return nums.length-1;
        }
        if(target > nums[end]){
            return nums.length;
        }

        //binary search for finding the insert position
        while(start < end){

            int mid = start + (end - start)/2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
