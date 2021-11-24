package com.company.conditional_and_loops;

//13.Addition Of Two Numbers

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter number 2: ");
        float num2 = sc.nextFloat();

        float ans = num1 + num2;
        System.out.println("Addition of two number is: ");
        System.out.println(ans);
    }
}
