package com.company.first_java_program;

//6.Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupees = sc.nextInt();
        float usd = 73.79f;
        float converted = rupees/usd;
        System.out.println(converted + "$");
    }
}
