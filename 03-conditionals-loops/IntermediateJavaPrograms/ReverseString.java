package com.company.conditional_and_loops;

//17.Reverse A String In Java

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        System.out.println("The reverse string is: ");
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
