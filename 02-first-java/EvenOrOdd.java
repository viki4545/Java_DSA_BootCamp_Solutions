package com.company.first_java_program;

//1.Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Number is even");
        }else if(n%2==1){
            System.out.println("Number is  odd");
        }

    }
}
