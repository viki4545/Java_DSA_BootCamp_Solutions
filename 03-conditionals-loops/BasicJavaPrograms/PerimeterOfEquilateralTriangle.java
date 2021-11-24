package com.company.conditional_and_loops;

//9.Perimeter Of Equilateral Triangle

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of a Equilateral Triangle: ");
        float a = sc.nextFloat();

        if(a > 0){
            //formula for perimeter of a equilateral triangle
            float perimeterOfEquilateralTriangle = (3*a);
            System.out.println("perimeter of a Equilateral Triangle is: ");
            System.out.println(perimeterOfEquilateralTriangle);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of radius of a Equilateral Triangle should be positive.");
        }

    }
}
