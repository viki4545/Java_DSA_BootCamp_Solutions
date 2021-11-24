package com.company.conditional_and_loops;

//6.Calculate Commission Percentage

import java.util.Scanner;

public class CalculateCommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sale price of the product: ");
        float salePrice = sc.nextInt();
        System.out.println("Enter the commission ammount: ");
        float commission = sc.nextInt();

        float commissionPercentage = (commission/salePrice)*100;
        System.out.println("The commision percentage of the product is: ");
        System.out.println(commissionPercentage + "%");
    }
}
