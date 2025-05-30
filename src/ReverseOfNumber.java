import java.util.Scanner;

public class ReverseOfNumber {

    public int reverse(int x) {

        int num = 0;
        int sign = 1;
        if(x < 0) {
            num = Math.abs(x);
            sign = -1;
        }
        else {
            num = x;
        }

        int remainder, result=0;

        while(num > 0) {
            remainder = num % 10;
            result = result * 10 + remainder;
            num = num / 10;
        }

        return result*sign;
    }

    public static void main(String[] args) {
        ReverseOfNumber reverseOfNumber = new ReverseOfNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = reverseOfNumber.reverse(n);
        System.out.println(reverse);
    }

}
