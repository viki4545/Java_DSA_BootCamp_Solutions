package com.company.conditional_and_loops;

//6.Area Of Rhombus

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the p_diagonal of an rhombus: ");
        float p_diagonal = sc.nextFloat();
        System.out.println("Enter the q_diagonal of an rhombus: ");
        float q_diagonal = sc.nextFloat();

        if(p_diagonal > 0 && q_diagonal > 0){
            //formula for area of a rhombus
            float areaOfRhombus = (p_diagonal*q_diagonal)/2;
            System.out.println("Area of an rhombus is: ");
            System.out.println(areaOfRhombus);
        }else{
            System.out.println("Invalid value!!");
            System.out.println("The value of p_diagonal & q_diagonal should be positive.");
        }
    }
}
