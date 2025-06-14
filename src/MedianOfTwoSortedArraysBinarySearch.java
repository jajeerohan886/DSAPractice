import java.util.*;

class MedianOfTwoSortedArraysBinarySearch {
    //Function to find the median of two sorted arrays.
    public double median(int[] arr1, int[] arr2) {
        // Size of two given arrays
        int n1 = arr1.length;
        int n2 = arr2.length;

        /* Ensure arr1 is not larger than
        arr2 to simplify implementation*/
        if (n1 > n2) return median(arr2, arr1);

        int n = n1 + n2;  // total length

        // Length of left half - Number of elements in the left half after combining
        int left = (n1 + n2 + 1) / 2;

        // Apply binary search
        int low = 0, high = n1;
        while (low <= high) {

            // Calculate mid index for arr1
            int mid1 = (low + high) / 2;

            // Calculate mid index for arr2
            int mid2 = left - mid1;

            // Calculate l1, l2, r1, and r2
            int l1 = (mid1 > 0) ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? arr1[mid1] : Integer.MAX_VALUE;
            int l2 = (mid2 > 0) ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r2 = (mid2 < n2) ? arr2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                // If condition for finding median
                if (n % 2 == 1) return Math.max(l1, l2);
                else return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            }
            else if (l1 > r2) {
                // Eliminate the right half of arr1
                high = mid1 - 1;
            } else {
                // Eliminate the left half of arr1
                low = mid1 + 1;
            }
        }
        // Dummy statement
        return 0;
    }

    public static void main(String[] args) {
//        int[] arr1 = {1, 4, 7, 10, 12};
//        int[] arr2 = {2, 3, 6, 15};
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {2, 3, 4};
        int[] arr1 = {1};
        int[] arr2 = {2, 3, 4};

        // Create an instance of the Solution class
        MedianOfTwoSortedArraysBinarySearch sol = new MedianOfTwoSortedArraysBinarySearch();

        // Print the median of the two sorted arrays
        System.out.printf("The median of two sorted arrays is %.1f\n", sol.median(arr1, arr2));
    }
}
