package com.company.conditional_and_loops;

//12.Calculate Average Marks

import java.util.Scanner;

public class AverageMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students: ");
        int noOfStudents = sc.nextInt();
        float totalMarks = 0;
        System.out.println("Enter the marks of the students: ");
        for (int i = 1; i <= noOfStudents; i++) {
            float marks = sc.nextInt();
            totalMarks = totalMarks + marks;
        }
        //formula for calculating average marks
        float averageMarks = totalMarks/noOfStudents;
        System.out.println("The average marks of the students is: ");
        System.out.println(averageMarks);
    }
}
