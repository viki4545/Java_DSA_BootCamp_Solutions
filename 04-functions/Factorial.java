package com.company.function_methods.assignments;

//9.Write a program to print the factorial of a number by defining a method named 'Factorial'.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is: ");
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        int fact = 1;
        if(n >= 0 && n <= 1){
            return 1;
        }else{
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }
}
