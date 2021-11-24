package com.company.function_methods.assignments;

//6.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("The area of the circle is: ");
        System.out.println(areaOfCircle(radius));
        System.out.println("The circumference of the circle is: ");
        System.out.println(circumferenceOfCircle(radius));
    }
    static float areaOfCircle(int radius){
        float area = ((3.14f) * (radius * radius));
        return area;
    }
    static float circumferenceOfCircle(int radius){
        float area = (2*(3.14f)*radius);
        return area;
    }
}
