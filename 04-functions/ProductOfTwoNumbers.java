package com.company.function_methods.assignments;

//5.Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int a = sc.nextInt();
        System.out.println("Enter the second no: ");
        int b = sc.nextInt();
        System.out.println("The product of two no is: ");
        System.out.println(product(a,b));
    }
    static int product(int a,int b){
        int product = a * b;
        return product;
    }
}
