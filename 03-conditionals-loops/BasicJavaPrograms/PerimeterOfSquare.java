package com.company.conditional_and_loops;

//12.Perimeter Of Square

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of a square : ");
        float sides = sc.nextFloat();

        if(sides > 0){
            //formula for perimeter of a square
            float PerimeterOfSquare = (4*(sides));
            System.out.println("perimeter of a square  is: ");
            System.out.println(PerimeterOfSquare);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of sides of a square should be positive.");
        }

    }
}
