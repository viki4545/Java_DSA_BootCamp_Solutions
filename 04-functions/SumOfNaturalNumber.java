package com.company.function_methods.assignments;

//14.Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The sum of N natural numbers is: ");
        System.out.println(sumOfNaturalNumbers(n));
    }
    static float sumOfNaturalNumbers(int n){
        float sum = (n*(n+1))/2;
        return sum;
    }
}
