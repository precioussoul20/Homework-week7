package javaprogrammes;
/*
* Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)*/


import java.util.Scanner;

public class Programme1_TernaryOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number to check Even or Odd Number");
        int num = s.nextInt();
        s.close();

        evenOrOdd(num);
    }
    // Method to find Even or Odd
    public static void evenOrOdd(int num){
        String evenodd = (num % 2 == 0) ? "Even": "Odd"; // Even or odd with Ternary operator
        System.out.println(num + " is " + evenodd + " number ");
    }
}

