package com.company.conditional_and_loops;

//14.Sum Of N Numbers

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float n = sc.nextFloat();

        float sumOfNaturalsNumbers = n*(n+1)/2;
        System.out.println("The sum of N naturals numbers is: ");
        System.out.println(sumOfNaturalsNumbers);
    }
}
