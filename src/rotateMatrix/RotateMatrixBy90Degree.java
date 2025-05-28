package rotateMatrix;

public class RotateMatrixBy90Degree {

    public void rotateBruteForce(int[][] matrix) {
        int n = matrix.length;;
        int[][] temp = new int[n][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {

            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        RotateMatrixBy90Degree sol = new RotateMatrixBy90Degree();

        sol.rotateBruteForce(arr);

        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
