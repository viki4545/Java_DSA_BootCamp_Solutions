package com.company.first_java_program;

//5.Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class PrintLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("The largest number is a : "+ a);
        }else {
            System.out.println("The largest number is b : "+ b);
        }
    }
}
