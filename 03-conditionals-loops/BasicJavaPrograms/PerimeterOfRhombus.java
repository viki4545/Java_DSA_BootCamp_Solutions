package com.company.conditional_and_loops;

//13.Perimeter Of Rhombus

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of a rhombus : ");
        float sides = sc.nextFloat();

        if(sides > 0){
            //formula for perimeter of a rhombus
            float PerimeterOfRhombus = (4*(sides));
            System.out.println("perimeter of a rhombus  is: ");
            System.out.println(PerimeterOfRhombus);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of sides of a rhombus should be positive.");
        }

    }
}
