package com.company.conditional_and_loops;

//7.Area Of Equilateral Triangle

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of an equilateral triangle: ");
        float a = sc.nextFloat();
        if(a > 0){
            //formula for area of a equilateral triangle
            float areaOfequilateralTriangle = (float) (Math.sqrt(3)/4)*(a*a);
            System.out.println("Area of an equilateral triangle is: ");
            System.out.println(areaOfequilateralTriangle);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of sides a should be positive.");
        }
    }
}
