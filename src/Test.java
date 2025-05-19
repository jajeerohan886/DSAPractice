public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabbcccdddddeaaa"; //a2b2c3d5e1a3
		int counter = 1;
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==s.charAt(i)) {
				counter++;
			} else {
				sb.append(s.charAt(i-1));
				sb.append(counter);
				counter=1;
			}
		}
		
		sb.append(s.charAt(s.length()-1));
		sb.append(counter);
		System.out.println(sb);
		
//		Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.
		String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
		String toSearch = "ODG";
//		Returns 9 (LODGESSSS)
		
		int minlen = 0;
		String dictItem = null;
		for(String str : dict) {
			if(str.contains(toSearch)) {
				if(minlen < str.length()) {
					dictItem = str;
					minlen = str.length();
				}
			}
		}
		System.out.println(minlen + "---" + dictItem);
		
	}
}
