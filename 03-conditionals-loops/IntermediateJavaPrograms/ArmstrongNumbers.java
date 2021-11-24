package com.company.conditional_and_loops;

//15.Armstrong Number In Java

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0){
            int rem = temp%10;
            count++;
            temp /= 10;
        }
        int temp2 = n;
        int  armStrong = 0;
        while (temp2 != 0){
            int rem = temp2%10;
            armStrong = armStrong + (int) Power.pow(rem,count);
            temp2 /= 10;
        }

        if(n == armStrong){
            System.out.println( n + " is an Armstrong number.");
        }else {
            System.out.println( n + " is not a Armstrong number.");
        }

    }
}
