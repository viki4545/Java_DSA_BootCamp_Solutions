package com.company.conditional_and_loops;

//17.Volume Of Sphere

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a sphere: ");
        float radius = sc.nextFloat();
        float pi = 3.14f;

        if(radius > 0){
            //formula for volume of a sphere
            float volumeOfSphere =  (4*pi*(radius*radius*radius))/3;
            System.out.println("Volume of a sphere is: ");
            System.out.println(volumeOfSphere);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of the radius & height should be positive.");
        }
    }
}
