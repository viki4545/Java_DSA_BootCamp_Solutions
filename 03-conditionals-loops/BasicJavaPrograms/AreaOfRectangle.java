package com.company.conditional_and_loops;

//3.Area Of Rectangle Program

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        float length = sc.nextFloat();
        System.out.println("Enter the width of the rectangle: ");
        float width = sc.nextFloat();
        if(length > 0 && width > 0) {
            //formula for area of a rectangle
            float areaOfRectangle = length * width;
            System.out.println("Area of a rectangle is: ");
            System.out.println(areaOfRectangle);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of the length & width should be positive");
        }
    }
}
