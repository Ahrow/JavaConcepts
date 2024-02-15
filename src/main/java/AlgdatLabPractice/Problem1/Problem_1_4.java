package AlgdatLabPractice.Problem1;

import java.util.Random;

/**
 * S = [10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73]
 * Delete an element in an array:
 * • At the starting array index
 * • At the ending array index
 * • At any random array index*/
public class Problem_1_4 {
    public static void main(String[] args) {
        int[] arr = {10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73};
        // Delete at the starting index
        int[] arrDeletedStart = deleteElement(arr, 0);

        // Delete at the ending index
        int[] arrDeletedEnd = deleteElement(arr, arr.length - 1);

        // Delete a random index
        Random rand = new Random();
        int randomIndex = rand.nextInt(arr.length);
        int[] arrDeletedRandom = deleteElement(arr, randomIndex);

        // Print arrays to verify
        System.out.println("Deleted first index: " + java.util.Arrays.toString(arrDeletedStart));
        System.out.println("Deleted last index: " + java.util.Arrays.toString(arrDeletedEnd));
        System.out.println("Deleted random index: " + java.util.Arrays.toString(arrDeletedRandom));
    }

    private static int[] deleteElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];

        if (index > 0) {
            System.arraycopy(arr, 0, newArr, 0, index);
        }

        if (index < arr.length - 1) {
            System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);
        }
        return newArr;
    }
}
