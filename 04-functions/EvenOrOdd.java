package com.company.function_methods.assignments;

//2.Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        evenOrOdd(n);
    }
    static void evenOrOdd(int n){
        if(n%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
