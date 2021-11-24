package com.company.conditional_and_loops;

//9.Calculate Batting Average

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of runs scored by the batter: ");
        int runScored = sc.nextInt();
        System.out.println("Enter the number of times the batter has been caught out: ");
        float timesOut = sc.nextFloat();

        //formula for calculating the batting average
        float battingAverage = (runScored/timesOut);
        System.out.println("The batting average of the player is: ");
        System.out.println(battingAverage);
    }
}
