package com.company.SearchingAlgorithms.Assignments.BinarySearch.Easy;

/*
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

Let's call an array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].




Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1

Example 4:
Input: arr = [3,4,5,1]
Output: 2

Example 5:
Input: arr = [24,69,100,99,79,78,67,36,26,19]
Output: 2


Constraints:

3 <= arr.length <= 104
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.


Follow up: Finding the O(n) is straightforward, could you find an O(log(n)) solution?
*/


public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end){

            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                //you are in the dec part of the array
                //this may be ans but look at left
                //this is why end != mid - 1;
                end = mid;
            }else{
                //you are in the asc part of the array
                start = mid + 1; //becaus we know that mid + 1 element > mid element hence we ignoring mid element
            }
        }
        //in the end start == end and pointing to the largest number because of the above two checks
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is the max one because that is what the checks say
        //more ellaboration: at every point of time for start and end, they have the best possible answer till that time
        //and if we are saying that only one item is remaining, hence because of above line that is the best possible ans
        return start; // or return end as both are equal
    }
}
