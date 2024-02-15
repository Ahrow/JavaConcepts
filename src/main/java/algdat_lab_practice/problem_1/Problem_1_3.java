package algdat_lab_practice.problem_1;

import java.util.Random;

// S = [10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73]
public class Problem_1_3 {
    // Insert an element in an array:
        //• At the starting array index
        //• At the ending array index
        //• At any random array index
    public static void main(String[] args) {
        int[] arr = {10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73};
        int x = 3;

        // In the middle array index
        int[] middleArr = new int[arr.length + 1];
        int centerIndex = (arr.length + 1) / 2;

        System.arraycopy(arr, 0, middleArr, 0, centerIndex);
        middleArr[centerIndex] = x;
        System.arraycopy(arr, centerIndex, middleArr, centerIndex + 1, arr.length - centerIndex);

        // At the starting array index
        int[] startArr = new int[arr.length + 1];
        arr[0] = x; // at the start
        System.arraycopy(arr, 0, startArr, 1, arr.length); // at the start

        //At the ending array index
        int [] endArr = new int[arr.length + 1];
        endArr[endArr.length - 1] = x; // at the end
        System.arraycopy(arr, 0, endArr, 0, arr.length); // at the end

        // At random index --> TODO : Duplicate X ???
        Random rand = new Random();
        int[] randomIndexArr = new int[arr.length + 1];
        int randomIndex = rand.nextInt(arr.length);

        System.arraycopy(arr, 0, randomIndexArr, 0, randomIndex);

        randomIndexArr[randomIndex] = x;

        System.arraycopy(arr, randomIndex, randomIndexArr, randomIndex + 1, arr.length - randomIndex);

        for (int i : startArr) {
            System.out.println("X at starting index: " + i);
        }
        for (int i : middleArr) {
            System.out.println("X at middle index: " + i);
        }
        for (int i : endArr) {
            System.out.println("X at last index: " + i);
        }
        for (int i: randomIndexArr) {
            System.out.println("X is at random index: " + i);
        }

    }
}
