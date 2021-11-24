package com.company.first_java_program;

//4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class CalculateBasicMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        if(operator == '+'){
            System.out.println("The addition of value a and b is : "+ (a+b));
        }else if(operator == '-'){
            System.out.println("The subtraction of value a and b is : "+ (a-b));
        }else if(operator == '*'){
            System.out.println("The multiplication of value a and b is : "+ (a*b));
        }else if(operator == '/'){
            System.out.println("The quotient of value a and b is : "+ (a/b));
        }else if(operator == '%'){
            System.out.println("The remainder of value a and b is : "+ (a%b));
        }else{
            System.out.println("Invalid operator");
        }
    }
}
