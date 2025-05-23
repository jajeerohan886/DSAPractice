import java.util.Scanner;

public class ClimbingStairs {

    public int calculateWays(int stairNo) {

        if(stairNo<=2) return stairNo;

        int first = 1, second = 2, temp = 0;

        for(int i=3;i<=stairNo;i++) {
            temp=first+second;
            first=second;
            second=temp;
        }
        return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int stairNo = sc.nextInt();

        ClimbingStairs climbingStairs = new ClimbingStairs();
        int ways = climbingStairs.calculateWays(stairNo);

        System.out.println(ways);
    }
}
