package com.company.conditional_and_loops;

//11.Perimeter Of Rectangle

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle : ");
        float length = sc.nextFloat();
        System.out.println("Enter the width of a rectangle : ");
        float width = sc.nextFloat();

        if(length > 0 && width > 0){
            //formula for perimeter of a rectangle
            float PerimeterOfRectangle = (2*(length+width));
            System.out.println("perimeter of a rectangle  is: ");
            System.out.println(PerimeterOfRectangle);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of length & width of a rectangle should be positive.");
        }

    }
}
