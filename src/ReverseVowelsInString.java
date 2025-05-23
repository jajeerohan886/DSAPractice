import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsInString {
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (!vowels.contains(arr[left])) {
                left++;
            } else if (!vowels.contains(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "aeiou";
        String output = reverseVowels(input);
        System.out.println("Reversed Vowels: " + output); // Output: holle
    }
}
