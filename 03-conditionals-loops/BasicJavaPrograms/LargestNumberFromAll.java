package com.company.conditional_and_loops;

import java.util.Scanner;

public class LargestNumberFromAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int max = 0;
        System.out.println("Enter the Number: ");
        while ((n = sc.nextInt())!= 0){
            max = Math.max(max,n);
        }
        System.out.println("Largest Number is: ");
        System.out.println(max);
    }
}
