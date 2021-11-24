package com.company.conditional_and_loops;

//22.Java Program Vowel Or Consonant

import java.math.BigInteger;
import java.util.Scanner;

public class VowelsOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter: ");
        char ch = sc.next().trim().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowels.");
        }else{
            System.out.println(ch + " is a consonent.");
        }
        BigInteger ans = new BigInteger(String.valueOf(0));

    }
}
