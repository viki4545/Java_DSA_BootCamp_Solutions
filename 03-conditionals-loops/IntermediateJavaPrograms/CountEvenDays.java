package com.company.conditional_and_loops;

//26.Kunal is allowed to go out with his friends only on the even days of a given month.
    // Write a program to count the number of days he can go out in the month of August.

import java.util.Scanner;

public class CountEvenDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The no of days in the month of Agust is 31");
        int days = 31;
        int count = 0;
        for (int i = 1; i <= days ; i++) {
            if(i%2==0){
                count++;
            }
        }
        System.out.println("The no of days he can go out is: ");
        System.out.println(count + " days");
    }
}
