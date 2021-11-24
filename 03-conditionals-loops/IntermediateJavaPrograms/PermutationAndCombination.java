package com.company.conditional_and_loops;

//16.Find Ncr & Npr

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of objects: ");
        float n = sc.nextInt();
        System.out.println("Enter the no of selected objects: ");
        float r = sc.nextInt();
        System.out.println("Enter the operation key: ");
        char ch = sc.next().trim().charAt(0);
        if(ch == 'p' || ch == 'P') {
            //Permutation
            float nPr = fact(n) / fact((n - r));
            System.out.println("The permutation is: ");
            System.out.println(nPr);
        }else if(ch == 'c' || ch == 'C') {
            //Combination
            float nCr = fact(n) / (fact(r) * (fact(n - r)));
            System.out.println("The Combination is: ");
            System.out.println(nCr);
        }else{
            System.out.println("Invalid key!!!");
        }

    }

    //function to find the factorial
    public static float fact(float n){
        float factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
