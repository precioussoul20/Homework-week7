package javaprogrammes;
// Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Programme12_AlphabetDigitCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter and Alphabet or Digit or Special character:");
        char ch = sc.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            System.out.println(ch + " is A Alphabet:");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A Digit:");
        } else {
            System.out.println(ch + " is A Special Character:");

            sc.close();
        }
    }
}
