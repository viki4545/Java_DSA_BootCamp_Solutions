package com.company.Arrays_and_ArrayList.Assignment.Easy;

/*
//https://leetcode.com/problems/flipping-an-image/

Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]


Constraints:

n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.
*/

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        flipAndInvertImage(image);
        System.out.print("[");
        for (int i = 0; i < image.length; i++) {
            System.out.print(Arrays.toString(image[i]) + " ");
        }
        System.out.print("]");
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int row = 0;row<image.length;row++){
            int start = 0;
            int end = image[0].length-1;
            while(start < end){
                int temp = image[row][start];
                image[row][start] = image[row][end];
                image[row][end] = temp;
                start++;
                end--;
            }
        }

        for(int row = 0;row<image.length;row++){
            for(int col = 0;col < image[row].length;col++){
                if(image[row][col] == 1){
                    image[row][col] = 0;
                }else{
                    image[row][col] = 1;
                }
            }
        }
        return image;
    }
}
