package pascalTriangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangleIII {

    // OPTIMISED APPROACH
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for(int row = 1;row<=n;row++) {
            pascalTriangle.add(generateRow(row));
        }
        return pascalTriangle;
    }

    public List<Integer> generateRow(int rowNumber) {
        List<Integer> rowList = new ArrayList<>();
        rowList.add(1); //Always 1st column value for any row is 1
        int result = 1;

        for(int columnNumber=1;columnNumber<rowNumber;columnNumber++) {
            result=result*(rowNumber-columnNumber);
            result=result/columnNumber;
            rowList.add(result);
        }
        return rowList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int row = sc.nextInt();

        PascalTriangleIII pascalTriangleIII = new PascalTriangleIII();
        List<List<Integer>> list = pascalTriangleIII.pascalTriangleIII(row);
        for(List<Integer> eachRow : list) {
            for(Integer i : eachRow) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

