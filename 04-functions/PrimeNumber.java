package com.company.function_methods.assignments;

//7.Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Number " + n + " is a prime number.");
        }else{
            System.out.println("Number " + n + " is not a prime number.");
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
            return true;
        }
}
