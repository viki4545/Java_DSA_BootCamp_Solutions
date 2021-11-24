package com.company.function_methods.assignments;

//12.Write a function to check if a given triplet is a Pythagorean triplet or not.

import java.util.Scanner;

public class Pythagoreas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int a = sc.nextInt();
        System.out.println("Enter the second no: ");
        int b = sc.nextInt();
        System.out.println("Enter the third no: ");
        int c = sc.nextInt();
        if(pythagoras(a,b,c)){
            System.out.println("The given triplet is a pythagorean triplet.");
        }else{
            System.out.println("The given triplet is not a pythagorean triplet.");
        }
    }
    static boolean pythagoras(int a,int b,int c){
        float thirdSquare = ((c)*(c));
        float otherTwoSideSquare = (((a)*(a))+((b)*(b)));
        if(thirdSquare == otherTwoSideSquare){
           return true;
        }else {
            return false;
        }
    }
}
