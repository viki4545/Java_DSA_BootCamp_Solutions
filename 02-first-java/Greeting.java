package com.company.first_java_program;

//2.Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("नमस्ते " + name + " जी");
    }
}
