package com.company.conditional_and_loops;

//11.Compound Interest Java Program

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial principal balance is: ");
        float principal = sc.nextFloat();
        System.out.println("Enter the interest rate: ");
        float interestRateAsPercentage = sc.nextFloat();
        float interestRateAsDecimal = interestRateAsPercentage/100;
        System.out.println("Enter the number of times interest is compouded per unit t is: ");
        float noOfTimesCompuded = sc.nextFloat();
        System.out.println("Enter the number of time periods elapsed: ");
        float time = sc.nextFloat();

        //formula for compound interest
        float a  = (principal*Power.pow((1 + interestRateAsDecimal/noOfTimesCompuded),(noOfTimesCompuded*time)));
        System.out.println("The compound interest of the given value is: ");
        System.out.println(a);
    }
}
