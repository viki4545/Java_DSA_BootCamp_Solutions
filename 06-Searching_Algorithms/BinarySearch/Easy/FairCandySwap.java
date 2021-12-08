package com.company.SearchingAlgorithms.Assignments.BinarySearch.Easy;

/*
//https://leetcode.com/problems/fair-candy-swap/

Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.
Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.
Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.



Example 1:
Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]

Example 2:
Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]

Example 3:
Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]

Example 4:
Input: aliceSizes = [1,2,5], bobSizes = [2,4]
Output: [5,4]


Constraints:

1 <= aliceSizes.length, bobSizes.length <= 104
1 <= aliceSizes[i], bobSizes[j] <= 105
Alice and Bob have a different total number of candies.
There will be at least one valid answer for the given input.
*/

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;

        for (int i = 0; i < aliceSizes.length; i++) {
            aliceSum += aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            bobSum += bobSizes[i];
        }

        int diff = (aliceSum - bobSum) / 2;

        Arrays.sort(aliceSizes);
        for (int num : bobSizes) {
            if (binarySearch(aliceSizes, num + diff) != -1) {
                return new int[]{num + diff, num};
            }
        }
        return null;
    }

    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
