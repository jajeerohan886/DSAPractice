import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3, 7, 8, 9};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int maxLength = Integer.MIN_VALUE;
        int currentLength = 1;
        for (int num : arr) {
            currentLength = 1;
            while (set.contains(num + 1)) {
                num++;
                currentLength++;
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        System.out.println(maxLength);
    }
}
