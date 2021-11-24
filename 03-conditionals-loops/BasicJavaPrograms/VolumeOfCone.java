package com.company.conditional_and_loops;

//14.Volume Of Cone Java Program

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a cone: ");
        float radius = sc.nextFloat();
        System.out.println("Enter the height of a cone: ");
        float height = sc.nextFloat();
        float pi = 3.14f;

        if(radius > 0 && height > 0){
            //formula for volume of a cone
            float volumeOfCone =  (pi*(radius*radius))*(height/3);
            System.out.println("Volume of a cone is: ");
            System.out.println(volumeOfCone);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of the radius & height should be positive.");
        }
    }

}
