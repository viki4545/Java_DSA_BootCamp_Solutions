package com.company.conditional_and_loops;

//18.Volume Of Pyramid

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base length of a pyramid: ");
        float baseLength = sc.nextFloat();
        System.out.println("Enter the base width of a pyramid: ");
        float baseWidth = sc.nextFloat();
        System.out.println("Enter the height of a pyramid: ");
        float height = sc.nextFloat();


        if(baseLength > 0 && baseWidth > 0 && height > 0){
            //formula for volume of a pyramid
            float volumeOfPyramid =  (baseLength*baseWidth*height)/3;
            System.out.println("Volume of a pyramid is: ");
            System.out.println(volumeOfPyramid);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of the radius & height should be positive.");
        }
    }
}
