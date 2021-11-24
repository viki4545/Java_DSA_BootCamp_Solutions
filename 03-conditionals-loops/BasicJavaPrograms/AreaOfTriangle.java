package com.company.conditional_and_loops;

//2.Area Of Triangle

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of a triangle: ");
        int base = sc.nextInt();
        System.out.println("Enter the height of a triangle: ");
        int height = sc.nextInt();
        if(base > 0 && height > 0) {
            //formula for area of a triangle
            float areaOfTriangle = 1 * (base * height) / 2;
            System.out.println("Area of a triangle is: ");
            System.out.println(areaOfTriangle);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of the base and height should be positive: ");
        }
    }
}
