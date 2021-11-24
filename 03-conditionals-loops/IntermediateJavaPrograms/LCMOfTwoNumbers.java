package com.company.conditional_and_loops;

//21.LCM Of Two Numbers

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
//       //by Gcd or Hcf or Gcf method
//        //formula for Lcm is
//        int lcm = (a*b)/Hcf(a,b);

        int lcm = Lcm(a,b);
        System.out.println("The lcm of value " + a + " & " + b + " is: ");
        System.out.println(lcm);


    }

    //function to find the hcf by prime factorizatin method
    static int Hcf(int a,int b){
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if(a%i ==0  && b%i == 0){
                hcf = i;
            }
        }
        return hcf;
    }

    //function to find lcm by bruteforce method
    static int Lcm(int a,int b){
        if(a == 0 || b == 0){
            return 0;
        }
//        int absNo1 = Math.abs(a);
////        System.out.println("Abs value 1: ");
////        System.out.println(absNo1);
//        int absNo2 = Math.abs(b);
////        System.out.println("Abs value 2: ");
////        System.out.println(absNo2);

        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int lcm = max;
        while (lcm % min != 0){
            lcm += max;
        }
        return lcm;
    }

}
