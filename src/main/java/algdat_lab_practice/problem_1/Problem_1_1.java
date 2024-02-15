package algdat_lab_practice.problem_1;

// S = [10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73]
public class Problem_1_1 {
    // Search two elements, i.e., x = 10, y = 84, z = 73, and w = 120 in this array.
    // What is the time complexity for searching x, y, z, and w?
    // You can find some guidance here to measure the execution time of the algorithm.
    public static void main(String[] args) {
        int[] numbers = {10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73};

        int x = 10;
        int y = 84;
        int z = 73;
        int w = 120;

        boolean foundX = false, foundY = false, foundZ = false;
        int indexX, indexY, indexZ;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
            if( numbers[i] == z ) {
                foundZ = true;
                indexZ = i;
                System.out.println("Found Z at index: " + indexZ);
            }
            if(numbers[i] == y ) {
                foundY = true;
                indexY = i;
                System.out.println("Found Y at index: " + indexY);
            }
            if(numbers[i] == x ) {
                foundX = true;
                indexX = i;
                System.out.println("Found X at index: " + indexX);
            }
            if(foundX && foundY && foundZ) {
                break;
            }
        }
    }
}
