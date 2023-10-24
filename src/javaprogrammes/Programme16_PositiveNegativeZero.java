package javaprogrammes;
// Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Programme16_PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();

        sc.close();

        if (number > 0) {
            System.out.println("The entered number is Positive:");
        } else if (number < 0) {
            System.out.println("The entered number is Negative:");
        } else {
            System.out.println("The entered number is Zero:");
        }
    }
}
