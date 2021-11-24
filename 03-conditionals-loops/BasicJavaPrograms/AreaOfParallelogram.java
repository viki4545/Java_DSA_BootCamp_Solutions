package com.company.conditional_and_loops;

//5.Area Of Parallelogram

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of an parallelogram: ");
        float base = sc.nextFloat();
        System.out.println("Enter the height of an parallelogram: ");
        float height = sc.nextFloat();

        if(base > 0 && height > 0){
            //formula for area of a parallelogram
            float areaOfParallelogram = (base*height);
            System.out.println("Area of an Parallelogram is: ");
            System.out.println(areaOfParallelogram);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of base & height should be positive.");
        }
    }
}
