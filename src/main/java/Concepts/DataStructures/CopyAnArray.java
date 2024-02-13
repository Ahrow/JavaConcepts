package Concepts.DataStructures;

import java.util.Arrays;

/**
      Source:  <a href="https://www.baeldung.com/java-array-copy">...</a>
  */
public class CopyAnArray {


     public static void main(String[] args) {

         // THE SYSTEM CLASS
         int[] array = {23,43, 55};
         int[] copiedArray = new int[3];

         // array -> src array
         // srcPos -> index to start copying from
         // copiedArray -> destination to copy to
         // destPos -> index to start copying to
         // length -> number of elements to copy
         System.arraycopy(array, 0, copiedArray, 0, 3);

         int[] arr = {23,43,55,12,65,88,92};
         int[] copiedArr = new int[3];

         System.arraycopy(arr, 2, copiedArr, 0, 3);

         // asset statements -> check if correct elements are copied from arr to copiedArr
         assert (copiedArr[0] == arr[2]);
         assert (copiedArr[1] == arr[3]);
         assert (copiedArr[2] == arr[4]);

         System.out.println("copiedArr length: " + copiedArr.length);
         System.out.println("copiedArr[0] == arr[2]: " + (copiedArr[0] == arr[2]));
         System.out.println("copiedArr[1] == arr[3]: " + (copiedArr[1] == arr[3]));
         System.out.println("copiedArr[2] == arr[4]: " + (copiedArr[2] == arr[4]));

         int[] arrayA = {23, 43, 55, 12};
         int newLength = array.length;

         int[] copiedArrayA = Arrays.copyOf(array, newLength);
         System.out.println(Arrays.toString(copiedArrayA));
     }
}
