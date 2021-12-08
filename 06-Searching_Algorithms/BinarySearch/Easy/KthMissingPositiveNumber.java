package com.company.SearchingAlgorithms.Assignments.BinarySearch.Easy;

/*
//https://leetcode.com/problems/kth-missing-positive-number/

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Find the kth positive integer that is missing from this array.



Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.


Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
*/

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // in this step we have to check the how many numbers are missing between them
            // if < than k then move the start to mid + 1 or if > than k then move the end to mid -1
            // for eg:- arr = [2,3,4,7,11] arr[mid] = 4,mid = 2 4-2-1 = 1 no is missing
            if(arr[mid] - mid - 1 < k){
                start  = mid + 1;
            }else{
                end = mid -1;
            }
        }
        //after looping we have some start value and then add k to it thats our ans
        return start+k;
    }
}
