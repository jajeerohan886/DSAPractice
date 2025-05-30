import java.util.Scanner;

public class PalindromeAndReverse {

    public boolean isPalindrome(int x) {

        int num = x;

        int remainder, result=0;

        while(num > 0) {
            remainder = num % 10;
            result = result * 10 + remainder;
            num = num / 10;
        }

        if(result == x) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        PalindromeAndReverse palindromeAndReverse = new PalindromeAndReverse();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = palindromeAndReverse.isPalindrome(n);
        System.out.println(b);
    }

}
