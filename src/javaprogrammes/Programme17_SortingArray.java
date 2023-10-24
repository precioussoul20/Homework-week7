package javaprogrammes;
//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Programme17_SortingArray {
    public static void main(String[] args) {
        // sorting a numeric array
        int[] numericArray = {5, 4, 8, 3, 1, 6};
        Arrays.sort(numericArray);

        System.out.println("Sorted Numeric Array:");
        for (int num : numericArray){
            System.out.print(num + " ");
        }
        System.out.println("\n");

        //sorting a string array
        String[] stringArray = {"Cat", "Dog", "Rabbit", "Sheep", "Pig", "Horse"};
        Arrays.sort(stringArray);

        System.out.println("Sorted String Array:");
        for (String str : stringArray){
            System.out.print(str + " ");
        }
    }
}
