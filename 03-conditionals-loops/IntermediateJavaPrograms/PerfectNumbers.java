package com.company.conditional_and_loops;

//23.Perfect Number In Java

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = sc.nextInt();
        long sum = 0;
        int i = 1;
        while (i <= n/2){
            if(n%i == 0){
                sum = sum+i;
            }
            i++;
        }
        if(sum == n){
            System.out.println(n + " is a perfect number.");
        }else {
            System.out.println(n + " is not a perfect number.");
        }
    }

}
