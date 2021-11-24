package com.company.conditional_and_loops;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int rem = n%i;
            if(rem == 0){
                System.out.print(i + " ");
            }
        }
    }
}
