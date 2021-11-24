package com.company.conditional_and_loops;

//1.Area Of Circle Java Program

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();
        if(r > 0) {
            //formula of area of a circle
            float area = pi * r * r;
            System.out.println("Area of the circle is: ");
            System.out.println(area);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of radius should be positive");
        }
    }
}
