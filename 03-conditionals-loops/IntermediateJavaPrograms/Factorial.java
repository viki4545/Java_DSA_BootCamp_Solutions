package com.company.conditional_and_loops;

//1.Factorial Program In Java

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want the factorial of: ");
        int n = sc.nextInt();
        BigInteger fact = new BigInteger("1");
        for (int i = n; i > 0 ; i--) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The factorial of the no "+ n + " is: ");
        System.out.println(fact);
    }
}
