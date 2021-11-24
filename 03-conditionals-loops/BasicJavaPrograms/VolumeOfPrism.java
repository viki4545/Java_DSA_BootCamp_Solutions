package com.company.conditional_and_loops;

//15.Volume Of Prism

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the type of prism you want the volume of: ");
            char ch = sc.next().trim().charAt(0);
            if (ch == 'n' || ch == 'N') {
                System.out.println("Enter the base area of the prism: ");
                float base = sc.nextFloat();
                System.out.println("Enter the length of the prism: ");
                float length = sc.nextFloat();
                if (base > 0 && length > 0) {
                    //formula for volume of a prism
                    float volumeOfPrism = (base * length);
                    System.out.println("Volume of a prism is: ");
                    System.out.println(volumeOfPrism);
                } else {
                    System.out.println("Invalid value!!!");
                    System.out.println("The value of a base area & length should be positive.");
                }
            } else if (ch == 't' || ch == 'T') {
                System.out.println("Enter the apothem length of the triangular prism: ");
                float apothemLength = sc.nextFloat();
                System.out.println("Enter the base length of the triangular prism: ");
                float baselength = sc.nextFloat();
                System.out.println("Enter the height of the triangular prism: ");
                float height = sc.nextFloat();

                if (apothemLength > 0 && baselength > 0 && height > 0) {
                    //formula for volume of a triangular prism
                    float volumeOfTriangularPrism = (1 * apothemLength * baselength * height)/2;
                    System.out.println("Volume of a triangular prism is: ");
                    System.out.println(volumeOfTriangularPrism);
                } else {
                    System.out.println("Invalid value!!!");
                    System.out.println("The value of a apothemlength,baselength & height should be positive.");
                }
            } else if (ch == 'r' || ch == 'R') {
                System.out.println("Enter the base width of the rectangular prism: ");
                float baseWidth = sc.nextFloat();
                System.out.println("Enter the base length of the rectangular prism: ");
                float baselength = sc.nextFloat();
                System.out.println("Enter the height of the rectangular prism: ");
                float height = sc.nextFloat();

                if (baseWidth > 0 && baselength > 0 && height > 0) {
                    //formula for volume of a rectangular prism
                    float volumeOfRectangularPrism = (baseWidth * baselength * height);
                    System.out.println("Volume of a rectangular prism is: ");
                    System.out.println(volumeOfRectangularPrism);
                } else {
                    System.out.println("Invalid value!!!");
                    System.out.println("The value of a baseWidth,baselength & height should be positive.");
                }
            } else if (ch == 'p' || ch == 'P') {
                System.out.println("Enter the apothem length of the pentagonal prism: ");
                float apothemLength = sc.nextFloat();
                System.out.println("Enter the base length of the pentagonal prism: ");
                float baselength = sc.nextFloat();
                System.out.println("Enter the height of the pentagonal prism: ");
                float height = sc.nextFloat();

                if (apothemLength > 0 && baselength > 0 && height > 0) {
                    //formula for volume of a pentagonal prism
                    float volumeOfPentagonalPrism = (5 * apothemLength * baselength * height)/2;
                    System.out.println("Volume of a pentagonal prism is: ");
                    System.out.println(volumeOfPentagonalPrism);
                } else {
                    System.out.println("Invalid value!!!");
                    System.out.println("The value of a apothemlength,baselength & height should be positive.");
                }
            } else if (ch == 'h' || ch == 'H') {
                System.out.println("Enter the apothem length of the hexagonal prism: ");
                float apothemLength = sc.nextFloat();
                System.out.println("Enter the base length of the hexagonal prism: ");
                float baselength = sc.nextFloat();
                System.out.println("Enter the height of the hexagonal prism: ");
                float height = sc.nextFloat();

                if (apothemLength > 0 && baselength > 0 && height > 0) {
                    //formula for volume of a hexagonal prism
                    float volumeOfHexagonalPrism = (3 * apothemLength * baselength * height);
                    System.out.println("Volume of a hexagonal prism is: ");
                    System.out.println(volumeOfHexagonalPrism);
                } else {
                    System.out.println("Invalid value!!!");
                    System.out.println("The value of a apothemlength,baselength & height should be positive.");
                }
            }else if (ch == 'x' || ch == 'X'){
                break;
            } else{
                System.out.println("Invalid type!!!");
            }
        }
    }
}
