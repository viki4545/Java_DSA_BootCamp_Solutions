package com.company.function_methods.assignments;

//10.Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isPalindrome(n) == n){
            System.out.println("The number is palindrome.");
        }else {
            System.out.println("The number is not palindrome.");
        }
    }
    static int isPalindrome(int n){
        int reverse = 0;
        while(n!=0){
            int rem = n%10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        return reverse;
    }
}
