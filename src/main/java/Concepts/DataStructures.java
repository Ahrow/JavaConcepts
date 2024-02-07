package Concepts;

public class DataStructures {
    public static void main(String[] args) {
        // Arrays
        /*
           An array stores data in an indexed position, starting at index 0.
           In the example below 2 is the first number, meaning its position
           in the array is at index 0
         */
        int[] numbers = {2,4,6,8,10};
        // Print string + numbers array index position 0
        System.out.println("First element: " + numbers[0]);

        // Loop through the array
        for (int i= 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Enhanced for loop
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
