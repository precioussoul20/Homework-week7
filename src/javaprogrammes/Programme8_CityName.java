package javaprogrammes;
 /* Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if "
  *  "any other alphabet should be invalid entry
  */


import java.util.Scanner;

public class Programme8_CityName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character from A to F:");
        char alphabet = sc.next().charAt(0);

        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("Ahmedabad");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("Bangalore");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("Chandigarh");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("Dehradun");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("Edar");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("Fardibad");
        } else {
            System.out.println("Invalid Entry");
        }
        sc.close();
    }
}

