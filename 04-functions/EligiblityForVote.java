package com.company.function_methods.assignments;

//3.A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class EligiblityForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person age to check the eligiblity to vote: ");
        int age = sc.nextInt();
        eligiblity(age);
    }
    static void eligiblity(int age){
        if(age >= 18){
            System.out.println("The person is eligible to vote.");
        }else{
            System.out.println("The person is not eligible to vote.");
        }
    }
}
