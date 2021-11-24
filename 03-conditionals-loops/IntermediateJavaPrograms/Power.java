package com.company.conditional_and_loops;

//7.Power In Java

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the power: ");
        int p = sc.nextInt();
        float result = pow(n,p);
        System.out.println("Result after " + n + " to the power " + p + " is: " );
        System.out.println(result);
    }
    static float pow(float number,float power){
        float ans = 1;
        for (int i = 0; i < power; i++) {
                ans = ans*number;
        }
        return ans;
    }
}
