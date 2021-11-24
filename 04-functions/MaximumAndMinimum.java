package com.company.function_methods.assignments;

//1.Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int a = sc.nextInt();
        System.out.println("Enter the second no: ");
        int b = sc.nextInt();
        System.out.println("Enter the third no: ");
        int c = sc.nextInt();
        System.out.println("The maximum no is: ");
        System.out.println(max(a,b,c));
        System.out.println("The minimum no is: ");
        System.out.println(min(a,b,c));
    }
    static int max (int a,int b,int c){
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else {
            return c;
        }
    }
    static int min(int a,int b,int c){
        if(a < b && a < c){
            return a;
        }else if(b < a && b < c){
            return b;
        }else {
            return c;
        }
    }
}
