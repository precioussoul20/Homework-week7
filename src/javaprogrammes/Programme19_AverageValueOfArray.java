package javaprogrammes;
// Write a Java program to calculate the average value of array elements.
public class Programme19_AverageValueOfArray {
    public static void main(String[] args) {
        //Define an array of integars
        double[] numbers ={16, 42, 55, 24, 35};
        double sum = 0; // initialize the variable to hold the sum
        double count = numbers.length;

        for (double number : numbers){
            sum += number;
        }
        // calculate the average
        double average = sum / count;
        System.out.println("Average value of array elements;" + average);
    }
}

