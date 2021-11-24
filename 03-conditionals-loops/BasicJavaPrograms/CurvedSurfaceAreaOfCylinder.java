package com.company.conditional_and_loops;

//19.Curved Surface Area Of Cylinder

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius of a curved surface area of cylinder: ");
            float radius = sc.nextFloat();
            System.out.println("Enter the height of a curved surface area of cylinder: ");
            float height = sc.nextFloat();
            float pi = 3.14f;

            if(radius > 0 && height > 0){
                //formula for volume of a curved surface area of cylinder
                float curvedSurfaceAreaOfCylinder =  (2*pi*radius*height);
                System.out.println("Volume of a curved surface area of cylinder is: ");
                System.out.println(curvedSurfaceAreaOfCylinder);
            }else{
                System.out.println("Invalid value!!");
                System.out.println("The value of the radius & height should be positive.");
            }
        }
}
