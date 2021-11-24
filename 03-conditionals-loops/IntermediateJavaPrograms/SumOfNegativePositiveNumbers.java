package com.company.conditional_and_loops;

//27.Write a program to print the sum of negative numbers,sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
    // The list terminates when the user enters a zero.

import java.util.Scanner;

public class SumOfNegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of numbers: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers: ");
        int num = 0;
        int negativeSum = 0;
        int positiveOddSum = 0;
        int positiveEvenSum = 0;
        for (int i = 0; i < n; i++) {
            if((num = sc.nextInt()) == 0){
                break;
            }else {
                if (num < 0) {
                    negativeSum++;
                }else if(num%2 == 0 && num > 0){
                    positiveEvenSum++;
                }else if(num%2 != 0 && num > 0){
                    positiveOddSum++;
                }
            }
        }
        System.out.println("The sum of negative no is: ");
        System.out.println(negativeSum);
        System.out.println("The sum of positive even sum is: ");
        System.out.println(positiveEvenSum);
        System.out.println("The sum of positive odd sum is: ");
        System.out.println(positiveOddSum);
    }
}
