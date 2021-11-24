package com.company.conditional_and_loops;

//10.Calculate CGPA Java Program

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks you have gotten: ");
        float marksGotten = sc.nextFloat();
        System.out.println("Enter the total marks: ");
        float totalMarks = sc.nextFloat();
        float percentage = ((marksGotten/totalMarks) * 100);
        System.out.println("The total percentage is: ");
        System.out.println(percentage + "%");

        //formula for calculating cgpa
        float cgpa = percentage/9.5f;
        System.out.println("The total cgpa you have gotten is: ");
        System.out.println(cgpa + " CGPA approx");
    }
}
