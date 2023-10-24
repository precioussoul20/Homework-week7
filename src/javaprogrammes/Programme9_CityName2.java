package javaprogrammes;
/* Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * Same as above program-8 using switch statement.
 * */

import java.util.Scanner;

public class Programme9_CityName2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character from A to F:");
        char alphabet = sc.next().charAt(0);

        sc.close();

        switch (alphabet){
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case  'B':
                System.out.println("Bangalore");
                break;
            case 'C':
                System.out.println("Chandigarh");
                break;
            case  'D':
                System.out.println("Dehradun");
                break;
            case 'E':
                System.out.println("Edar");
                break;
            case 'F':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
    }

