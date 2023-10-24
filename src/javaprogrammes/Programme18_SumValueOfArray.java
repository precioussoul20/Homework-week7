package javaprogrammes;
// Write a Java program to sum values of an array.

public class Programme18_SumValueOfArray {
    public static void main(String[] args) {
        //Define an array of integars
        int[] numbers = {10, 22, 35, 24, 15};
        int sum = 0; // initialize a variable to hold the sum

        for (int number : numbers){ // iterate through the array and add each number to the sum
            sum += number;

        }
        System.out.println("Sum Value of Array:" + sum);// Display the sum
    }
}
