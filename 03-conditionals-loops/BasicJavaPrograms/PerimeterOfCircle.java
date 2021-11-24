package com.company.conditional_and_loops;

//8.Perimeter Of Circle

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        float radius = sc.nextFloat();
        float pi = 3.14f;

        if(radius > 0){
            //formula for perimeter of a circle
            float circumferencesOfCircle = (2*pi*radius);
            System.out.println("perimeter of a circle is: ");
            System.out.println(circumferencesOfCircle);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of radius of a circle should be positive.");
        }

    }
}
