package javaprogrammes;
//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Programme6_OddEven {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = r.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
            r.close();
        }
    }
}