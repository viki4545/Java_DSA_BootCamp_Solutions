package com.company.conditional_and_loops;

//10.Perimeter Of Parallelogram

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of a Parallelogram : ");
        float sides = sc.nextFloat();
        System.out.println("Enter the base of a Parallelogram : ");
        float base = sc.nextFloat();

        if(sides > 0 && base > 0){
            //formula for perimeter of a parallelogram
            float PerimeterOfParallelogram = (2*(sides+base));
            System.out.println("perimeter of a Parallelogram  is: ");
            System.out.println(PerimeterOfParallelogram);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of sides & base of a Parallelogram  should be positive.");
        }

    }
}
