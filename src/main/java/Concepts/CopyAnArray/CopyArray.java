package Concepts.CopyAnArray;
/**
 <a href="https://www.baeldung.com/java-array-copy">...</a>
 */

public class CopyArray {
    // System.arrayCopy()

    public static void main(String[] args) {
        // Copy full array to another
        int[] array = {23, 43, 55};
        int[] copiedArray = new int[3];
        System.arraycopy(array, 0, copiedArray, 0, 3);
        for(int i : copiedArray) {
            System.out.println(i);
        }

        int[] arr = {23, 43, 55, 12, 65, 88, 92};
        int[] copiedArr = new int[3];
        // Copy sub-sequence from source array -> destination
        System.arraycopy(arr, 2, copiedArr, 0, 3);

        assert(copiedArr[0] == arr[2]);
        assert(copiedArr[1] == arr[3]);
        assert(copiedArr[2] == arr[4]);

        System.out.println("copiedArr length: " + copiedArr.length);
        System.out.println("copiedArr[0] == arr[2]: " + (copiedArr[0] == arr[2]));
        System.out.println("copiedArr[1] == arr[3]: " + (copiedArr[1] == arr[3]));
        System.out.println("copiedArr[2] == arr[4]: " + (copiedArr[2] == arr[4]));
    }
}
