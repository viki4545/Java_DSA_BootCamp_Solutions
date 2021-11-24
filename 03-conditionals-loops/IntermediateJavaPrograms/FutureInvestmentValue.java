package com.company.conditional_and_loops;

//19.Future Investment Value

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the present value of investment: ");
        int pv = sc.nextInt();
        System.out.println("Enter the rate of interest of investment: ");
        float roi = sc.nextFloat();
        System.out.println("Enter the no of interest compunding of investment: ");
        float noOfInterestCompunding = sc.nextFloat();

        //formula for future investment value
        float futureValue = (pv * Power.pow((1 + roi),noOfInterestCompunding));
        System.out.println("The future value of your investment is: ");
        System.out.println(futureValue);
    }
}
