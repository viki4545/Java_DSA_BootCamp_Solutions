package com.company.conditional_and_loops;

//22.https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

import java.util.Scanner;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The difference between the product of its digits and sum of the digits is: ");
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int product = 1,sum = 0;
        while(n > 0){
            int rem = n%10;
            product = product*rem;
            sum = sum + rem;
            n = n/10;
        }
        return product - sum;
    }
}
