package algdat_lab_practice.problem_1;

public class Problem_1_2 {
    // Reverse Traverse the array (from N to 0).
    //S = [10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73]
    public static void main(String[] args) {
        int [] numbers = {10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73};

        int[] arr = {10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73};
        int n = arr.length;


        for(int i = n - 1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
