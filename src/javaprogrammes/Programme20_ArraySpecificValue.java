package javaprogrammes;
// Write a Java program to test if an array contains a specific value.
public class Programme20_ArraySpecificValue {
    public static void main(String[] args) {

        int[] numericArray = {5,2, 9, 1, 5, 6};
        int targetvalue = 9;

        boolean containsValue = containsValue(numericArray, targetvalue);

        if (containsValue){
            System.out.println("The array contains the value " + targetvalue);
        }else{
            System.out.println("The array does not contains the value " + targetvalue);
        }
    }
    public static boolean containsValue(int[] array, int targetValue){
        for (int value : array){
            if (value == targetValue){
                return true;
            }
        }
        return false;
    }
}
