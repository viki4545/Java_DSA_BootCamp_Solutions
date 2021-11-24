package com.company.conditional_and_loops;

//21.Fibonacci Series In Java Programs

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a + " " + b + " ");
        while (n >= count){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
            System.out.print(b + " ");
        }
    }
}
