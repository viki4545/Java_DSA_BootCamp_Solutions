package com.company.conditional_and_loops;

//20.Total Surface Area Of Cube

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of a total surface area of a cube: ");
        float sides = sc.nextFloat();

        if(sides > 0){
            //formula for volume of a total surface area of a cube
            float totalSurfaceAreaOfCube =  (6*(sides*sides));
            System.out.println("Volume of a total surface area of a cube is: ");
            System.out.println(totalSurfaceAreaOfCube);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of all the sides should be positive.");
        }
    }
}
