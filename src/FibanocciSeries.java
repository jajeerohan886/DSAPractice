import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibanocciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> fibSeries = new ArrayList<>();

        int first = 0;
        int second = 1;
        fibSeries.add(first);
        fibSeries.add(second);

        for(int i=3;i<n;i++) {
            int third = first+second;
            first = second;
            second = third;

            fibSeries.add(third);
        }

        for(Integer i : fibSeries) {
            System.out.print(i + " ");
        }
    }
}
