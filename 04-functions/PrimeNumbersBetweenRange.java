package com.company.function_methods.assignments;

//13.Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class PrimeNumbersBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int a = sc.nextInt();
        System.out.println("Enter the ending range: ");
        int b = sc.nextInt();
        System.out.println("The prime number between " + a + " & " + b + " is: ");
        primeNumbers(a,b);
    }
    static void primeNumbers(int a,int b){
        int count;
        for (int i = a; i <= b; i++) {
            count = 0;
            for (int j = 1; j <= i ; j++) {
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i + " ");
            }
        }
    }
}
