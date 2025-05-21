package PascalTriangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangleII {

    // BRUTE FORCE
    public List<Integer> calculate(int n) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int row = sc.nextInt();

        PascalTriangleII pascalTriangleII = new PascalTriangleII();
        List<Integer> list = pascalTriangleII.calculate(row);
        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}

