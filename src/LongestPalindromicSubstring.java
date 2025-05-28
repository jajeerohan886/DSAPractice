public class LongestPalindromicSubstring {

	public static String findLongestPalindrome(String s) {
//		if (s == null || s.length() < 1)
//			return new String("");

		if(s.length() == 1) return s;

		String LPS = "";

		for(int i=1;i<s.length();i++)  {

			// for odd length string which is a palindrome
			int low = i;
			int high = i;

			while(s.charAt(low) == s.charAt(high)) {
				low--;
				high++;

				if(low == -1 || high == s.length()) {
					break;
				}
			}

			String palindrome = s.substring(low+1, high);
			if(palindrome.length() >= LPS.length()) {
				LPS = palindrome;
			}

			//for even length string which is a palindrome
			low = i-1;
			high = i;

			while(s.charAt(low) == s.charAt(high)) {
				low--;
				high++;

				if(low == -1 || high == s.length()) {
					break;
				}
			}

			palindrome = s.substring(low+1, high);
			if(palindrome.length() >= LPS.length()) {
				LPS = palindrome;
			}
		}
		return LPS;
	}

	//Second way
	public static String longestPalindromeSubstring(String s) {
		String res = "";
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			// ODD
			int l = i, r = i;
			while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
				if (r - l + 1 > maxLength) {
					maxLength = r - l + 1;
					res = s.substring(l, r + 1);
				}
				l--;
				r++;
			}

			// even
			l = i;
			r = i + 1;
			while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
				if (r - l + 1 > maxLength) {
					maxLength = r - l + 1;
					res = s.substring(l, r + 1);
				}
				l--;
				r++;
			}
		}
		return res;
	}

	// Test the method
	public static void main(String[] args) {
//		String input = "forgeeksskeegrof";
		String input = "ABAABADAB";
		String result = findLongestPalindrome(input);
		System.out.println("Longest Palindrome: " + result);
		System.out.println("Length: " + result.length());
	}
}


