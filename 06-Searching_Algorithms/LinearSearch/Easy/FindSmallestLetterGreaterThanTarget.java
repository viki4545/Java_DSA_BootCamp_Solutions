package com.company.SearchingAlgorithms.Assignments.LinearSearch.Easy;

/*
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.


Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"

Example 3:
Input: letters = ["c","f","j"], target = "d"
Output: "f"

Example 4:
Input: letters = ["c","f","j"], target = "g"
Output: "j"

Example 5:
Input: letters = ["c","f","j"], target = "j"
Output: "c"


Constraints:

2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.
*/


public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        char ch = '{';
        char ch1 = '{';
        for(int i =0;i<letters.length;i++){
            if(letters[i] > target){
                if(letters[i] < ch){
                    ch = letters[i];
                }
            }

            if(letters[i] < ch1){
                ch1 = letters[i];
            }
        }
        if(ch == '{'){
            return ch1;
        }
        return ch;
    }
}
