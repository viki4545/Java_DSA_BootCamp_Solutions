package com.company.conditional_and_loops;

//16.Volume Of Cylinder

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder: ");
        float radius = sc.nextFloat();
        System.out.println("Enter the height of a cylinder: ");
        float height = sc.nextFloat();
        float pi = 3.14f;

        if(radius > 0 && height > 0){
            //formula for volume of a cylinder
            float volumeOfCylinder =  (pi*(radius*radius))*(height);
            System.out.println("Volume of a cylinder is: ");
            System.out.println(volumeOfCylinder);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of the radius & height should be positive.");
        }
    }
}
