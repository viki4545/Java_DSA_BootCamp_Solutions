package com.company.conditional_and_loops;

//24.Check Leap Year Or Not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n = sc.nextInt();
        if(n%4 == 0){
            System.out.println(n + " is a leap year.");
        }else{
            System.out.println(n + " is not a leap year.");
        }
    }
}
