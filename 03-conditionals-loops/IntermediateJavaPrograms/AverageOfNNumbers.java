package com.company.conditional_and_loops;

//3.Calculate Average Of N Numbers

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n = sc.nextInt();
        int sum = 0;
        float count = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            count++;
        }
        float average = sum/count;
        System.out.println("The average of the n natural number is: ");
        System.out.println(average);
    }
}
