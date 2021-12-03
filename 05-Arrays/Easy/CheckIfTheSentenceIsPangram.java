package com.company.Arrays_and_ArrayList.Assignment.Easy;

/*
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false


Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
*/

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentenance = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentenance));
    }
    public static boolean checkIfPangram(String sentence) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        for(char ch: str.toCharArray()){
            if(sentence.indexOf(ch) == -1){
                return false;
            }
        }
        return true;
    }
}
