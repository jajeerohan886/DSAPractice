package pascalTriangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangleII {

    // BRUTE FORCE
    public List<Integer> bruteForceMethod(int n) {
        List<Integer> rowList = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            int value = ncr(n-1, i-1);
            rowList.add(value);
        }
        return rowList;
    }

    public int ncr(int n, int r) {
        int result = 1;
        for(int i=0;i<r;i++) {
            result = result * (n-i);
            result = result / (i+1);
        }
        return result;
    }

    // OPTIMISED APPROACH
    public List<Integer> optimisedMethod(int rowNumber) {
        List<Integer> resultRow = new ArrayList<>();
        resultRow.add(1); //Always 1st column value for any row is 1
        int result = 1;

        for(int i=1;i<rowNumber;i++) {
            result = result * (rowNumber-i);
            result = result / i;
            resultRow.add(result);
        }
        return resultRow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int row = sc.nextInt();

        PascalTriangleII pascalTriangleII = new PascalTriangleII();
//        List<Integer> list = pascalTriangleII.bruteForceMethod(row);
        List<Integer> list = pascalTriangleII.optimisedMethod(row);
        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}

