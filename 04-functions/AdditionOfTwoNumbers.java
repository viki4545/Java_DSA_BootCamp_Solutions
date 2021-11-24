package com.company.function_methods.assignments;

//4.Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int a = sc.nextInt();
        System.out.println("Enter the second no: ");
        int b = sc.nextInt();
        System.out.println("The sum of two no is: ");
        System.out.println(addition(a,b));
    }
    static int addition(int a,int b){
        int sum = a + b;
        return sum;
    }
}
