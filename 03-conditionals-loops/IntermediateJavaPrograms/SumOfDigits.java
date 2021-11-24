package com.company.conditional_and_loops;

//25.Sum Of A Digits Of Number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println("The sum of no of digits is: ");
        System.out.println(sum);
    }
}
