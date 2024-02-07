package Concepts;

import java.util.ArrayList;

public class DataStructures {
    public static void main(String[] args) {
        // Arrays
        /*
           An array stores data in an indexed position, starting at index 0.
           In the example below 2 is the first number, meaning its position
           in the array is at index 0
         */

        // Dynamic array -> Grows automatically when new elements are added
        ArrayList<String> myArray = new ArrayList<>();

        // Adding elements to the ArrayList
        myArray.add("Hello");
        myArray.add("World");
        myArray.add("Java");
        myArray.add("Programming");

        // Print first element of the ArrayList
        if (!myArray.isEmpty()) { // Check if the ArrayList is not empty
            System.out.println("First element of ArrayList: " + myArray.get(0));
        }

        // Loop through the ArrayList using standard for loop
        System.out.println("\nUsing standard for loop:");
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }

        // Loop through the ArrayList using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String element : myArray) {
            System.out.println(element);
        }

        // Fixed size array -> Faster memory access, simple structure
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
