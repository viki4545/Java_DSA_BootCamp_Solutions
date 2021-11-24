package com.company.conditional_and_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        System.out.println("Enter the number: ");
        while((n = sc.nextInt()) != 0){
            sum += n;
        }
        System.out.println("Sum of all the number is : ");
        System.out.println(sum);
    }
}
