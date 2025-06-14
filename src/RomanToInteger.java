import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) { // MCMXCIV
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            if (currentValue < prevValue) {
                result -= currentValue; // subtract if smaller than the next numeral (like IV = 4)
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }
        return result;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV"; // Example: 1994
        int result = romanToInt(roman);
        System.out.println("Roman numeral " + roman + " is " + result);
    }
}
