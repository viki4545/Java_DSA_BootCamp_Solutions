package com.company.conditional_and_loops;

//5.Calculate Distance Between Two Points

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x and y coordinate of point one: ");
        float x1 = sc.nextInt();
        float y1 = sc.nextInt();
        System.out.println("Enter the x and y coordinate of point two: ");
        float x2 = sc.nextInt();
        float y2 = sc.nextInt();
        float distance = (float) Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        System.out.println("The distance between two points is: ");
        System.out.println(distance);
    }
}
