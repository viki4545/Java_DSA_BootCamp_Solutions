package com.company.SearchingAlgorithms.Assignments.LinearSearch.Easy;

/*
//https://leetcode.com/problems/intersection-of-two-arrays-ii/

Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000


Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] arr  = new int[1000];
        List<Integer> list = new ArrayList<>();
        //we basically use count sort array for nums1
        for(int i =0;i<nums1.length;i++){
            arr[nums1[i]]++;
        }

        for(int i =0;i<nums2.length;i++){
            if(arr[nums2[i]] != 0){
                //condition for each element in the result may appear as many times it shows in both array
                arr[nums2[i]]--;
                //we basically add the element in the list
                list.add(nums2[i]);
            }
        }
        //here we basically convert the list into array
        int[] ans  = new int[list.size()];
        int k = 0;
        for(int num : list){
            ans[k++] = num;
        }
        return ans;
    }
}
