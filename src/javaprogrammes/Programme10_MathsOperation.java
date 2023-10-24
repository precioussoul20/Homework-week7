package javaprogrammes;

import java.util.Scanner;

/**
 *Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 *find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */

public class Programme10_MathsOperation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = scan.nextInt();
        System.out.println("Enter the Operator( +, -, *, / );");
        char ch = scan.next().charAt(0);

        double results;

        if (ch == '+') {
            results = num1 + num2;
            System.out.println("Result:" + num1 + " + " + num2 + " = " + results);
        } else if (ch == '-') {
            results = num1 - num2;
            System.out.println("Result:" + num1 + " - " + num2 + " = " + results);
        } else if (ch == '*') {
            results = num1 * num2;
            System.out.println("Result:" + num1 + " * " + num2 + " = " + results);
        } else if (ch == '/') {
            results = num1 / num2;
            System.out.println("Result:" + num1 + " / " + num2 + " = " + results);
        } else {
            System.out.println("Invalid Operator");
        }
        scan.close();
    }
}



