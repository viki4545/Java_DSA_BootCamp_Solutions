package com.company.conditional_and_loops;

//4.Area Of Isosceles Triangle

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of an isosceles triangle: ");
        float base = sc.nextFloat();
        System.out.println("Enter the height of an isosceles triangle: ");
        float height = sc.nextFloat();

        if(base > 0 && height > 0){
            //formule of an isosceles triangle
            float areaOfIsoscelesTriangle = (1*base*height)/2;
            System.out.println("Area of an isosceles triangle: ");
            System.out.println(areaOfIsoscelesTriangle);
        }else{
            System.out.println("Invalid value!!!");
            System.out.println("The value of a base & height should be positive.");
        }

    }
}
