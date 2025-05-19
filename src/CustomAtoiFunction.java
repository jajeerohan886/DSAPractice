public class CustomAtoiFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "-123456";
		
		int result = customAtoi(s1);
		System.out.println(result);
		
		

	}
	
	public static int customAtoi(String str) {
		
        str = str.trim();
		
		int index = 0;
		int result = 0;
		int sign = 1;
		
		// Check if number is +ve or -ve by getting first character of the string
		if(str.charAt(index)=='-') {
			index++;
			sign = -1;
		} else if(str.charAt(index)=='+') {
			index++;
		}
		
		while(index<str.length()) {
			char c = str.charAt(index);
			if(c < '0' || c > '9') {
				return -1;
			}
			int num = c - '0';
			result = result * 10 + num;
			index++;
		}
		return result*sign;
		
	}

}
