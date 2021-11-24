package com.company.conditional_and_loops;

//8.Calculate Depreciation of Value

import com.company.conditional_and_loops.Power;

import java.util.Scanner;

public class CalculateDepreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of certain time is: ");
        float v1 = sc.nextFloat();
        System.out.println("Enter the rate of per annum: ");
        float r = sc.nextFloat();
        System.out.println("Enter time in years: ");
        float t = sc.nextFloat();
        if(r <= 100 && r > 0) {

            //formula for calculating the depreciation
            float depreciation = (v1 * Power.pow((1 - r / 100), t));
            System.out.println("The depriciation value in " + t + " years is: ");
            System.out.println(depreciation);
        }else{
            System.out.println("The rate value should be smaller than or equal to 100 & greater than zero");
        }
    }
}
