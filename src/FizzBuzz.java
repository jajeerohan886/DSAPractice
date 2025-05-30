import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            String fb = String.valueOf(i);

            if(i%3 == 0 && i%5 == 0) {
                fb = "FizzBuzz";
            }
            else if(i%3 == 0) {
                fb = "Fizz";
            }
            else if(i%5 == 0) {
                fb = "Buzz";
            }
            list.add(fb);
        }

        return list;
    }

    public static void main(String[] args) {
        int n=20;
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> list = fizzBuzz.fizzBuzz(n);

        for(String s:list) {
            System.out.print(s+" ");
        }
    }

}
