package javaprogrammes;
/*
 Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
*/

import java.util.Scanner;

public class Programme2_LeapYear {

    public static void main(String[] args) {
        int y;
        System.out.println("Enter year to check leap year or not:");
        Scanner s =new Scanner(System.in);
        y = s.nextInt();

        if(y% 100==0 && y%400==0 || y%100!=0 && y%4==0){
            System.out.println("Leap Year");

        } else {
            System.out.println("Not Leap Year");
            s.nextInt();

            s.close();
        }
    }
}
