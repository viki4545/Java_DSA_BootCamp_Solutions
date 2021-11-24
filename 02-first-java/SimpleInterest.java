package com.company.first_java_program;

//3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        float t = sc.nextFloat();

        float simpleInterest = (p*r*t)/100;

        System.out.println(simpleInterest);
    }
}
