import java.util.Arrays;
import java.util.List;

public class LongestWordWithSubstringSlidingWindowApproach {

    public static int longestWordWithSubstring(List<String> dict, String toSearch) {
        int windowSize = toSearch.length();
        int maxLength = Integer.MIN_VALUE;
        toSearch = toSearch.toLowerCase();

        for(String word : dict) {
            word = word.toLowerCase();
            int wordLength = word.length();

            if(wordLength < windowSize) {
                continue;
            }

            for(int i=0;i<=wordLength-windowSize;i++) {
                String substring = word.substring(i,i+windowSize).toLowerCase();
                if(substring.equals(toSearch)) {
                    maxLength = Math.max(maxLength, wordLength);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
//        List<String> dict = Arrays.asList("CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS", "OD");
        List<String> dict = Arrays.asList("CODJE", "ODG");

        String toSearch = "ODG";

        int result = longestWordWithSubstring(dict, toSearch);
        System.out.println("Length of longest word containing the substring: " + result);
    }

}
