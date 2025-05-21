package PascalTriangle;

import java.util.Scanner;

public class PascalTriangleI {

    // BRUTE FORCE
    public int calculate(int n,  int r) {
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
        System.out.println("Enter column number : ");
        int column = sc.nextInt();

        PascalTriangleI pascalTriangleI = new PascalTriangleI();
        int value = pascalTriangleI.calculate(row-1, column-1);
        System.out.println("Value at row " + row + " & column " + column + " is " + value);
    }
}
