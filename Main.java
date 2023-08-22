import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] array1 = new int[] { 3, 2, 2, 3 };
        int[] array2 = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        int[] array3 = new int[] { 0, 1, 4, 7, 7, 8, 7, 10 };

        System.out.println(Arrays.toString(array1) + " " + sol.removeElement(array1, 3));
        System.out.println(Arrays.toString(array2) + " " + sol.removeElement(array2, 2));
         System.out.println(Arrays.toString(array3) + " " + sol.removeElement(array3, 7));
    } 
}
