package com.company.conditional_and_loops;

//2.Calculate Electricity Bill

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of units used: ");
        long units = sc.nextInt();
        float totalBill = 0;
        if(units <= 100){
            totalBill = (units * 10);
        }else if(units <= 200){
            totalBill = (100 * 10) + (units - 100)*15;
        }else if(units <= 300){
            totalBill = (100 * 10) + (100 * 15) + (units - 200)*20;
        }else if(units > 300){
            totalBill = (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25;
        }
        System.out.println("Your total bill ammount is: ");
        System.out.println(totalBill + "rupees");
    }
}
