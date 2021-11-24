package com.company.conditional_and_loops;

//20.HCF Of Two Numbers Program

import java.util.Scanner;

public class HCFOftwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        int hcf = 0;
        //prime factorization method
//        for (int i = 1; i <= num1 || i <= num2; i++) {
//            if(num1%i == 0 && num2%i == 0){
//                hcf = i;
//            }
//        }

        //divison method
        int on1 = n1,on2 = n2;
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        System.out.println("The hcf of " + on1 + " & " + on2 + " is: ");
        System.out.println(n2);
    }

}
