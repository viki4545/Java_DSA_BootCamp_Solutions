package com.company.conditional_and_loops;

//18.Find if a number is palindrome or not

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int reverse = 0;
        int temp = n;
        while(temp != 0){
            int rem = temp%10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        if(reverse == n){
            System.out.println(n + " number is palindrome.");
        }else{
            System.out.println(n + " number is not palindrome.");
        }

    }
}
