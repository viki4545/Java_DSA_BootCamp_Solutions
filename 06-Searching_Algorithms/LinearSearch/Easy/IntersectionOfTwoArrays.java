package com.company.SearchingAlgorithms.Assignments.LinearSearch.Easy;

/*
//https://leetcode.com/problems/intersection-of-two-arrays/

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] arr  = new int[1000];
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            arr[nums1[i]]++;
        }

        for(int i = 0;i<nums2.length;i++){
            if(arr[nums2[i]]!=0){

                arr[nums2[i]] = 0;
                list.add(nums2[i]);
            }
        }

        int[] ans = new int[list.size()];
        int k = 0;
        for(int num : list){
            ans[k++] = num;
        }
        return ans;
    }
}
