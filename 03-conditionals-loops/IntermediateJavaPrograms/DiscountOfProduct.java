package com.company.conditional_and_loops;

//4.Calculate Discount Of Product

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the product: ");
        float priceOfProduct = sc.nextFloat();
        System.out.println("Enter the discount percentage: ");
        float discountPercentage = sc.nextFloat();
        float discount = priceOfProduct * (discountPercentage/100);
        System.out.println("Discount amount of the product is: ");
        System.out.println(discount);
        System.out.println("Final price of the product is: ");
        System.out.println(priceOfProduct - discount);

    }
}
