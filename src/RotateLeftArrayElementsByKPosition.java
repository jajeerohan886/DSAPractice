import java.util.*;

class RotateLeftArrayElementsByKPosition {

    // 1st Method
    // Function to rotate the array to the left by k positions
    public void rotateArray1stMethod(int[] nums, int k) {
        int n = nums.length; // Size of array
        k = k % n; // To avoid unnecessary rotations

        int[] temp = new int[k];

        // Store first k elements in a temporary array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        // Shift n-k elements of given array to the front
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        // Copy back the k elements at the end
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }

    public static void printArray(int[] nums) {
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // 2nd Method
    public void rotateArray2ndMethod(int[] nums, int k) {

        k = k%nums.length;
        // OPTIMAL APPROACH
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
        reverseArray(nums, 0, nums.length-1);
    }

    public static void reverseArray(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1stMethod = {1, 2, 3, 4, 5, 6};
        int k1 = 3;

        System.out.println("Initial array: ");
        printArray(nums1stMethod);

        // Create an instance of the Solution class
        RotateLeftArrayElementsByKPosition sol = new RotateLeftArrayElementsByKPosition();

        /* Function call to rotate the
        array to the left by k places */
        sol.rotateArray1stMethod(nums1stMethod, k1);

        System.out.println("Array after rotating elements by " + k1 + " places: ");
        printArray(nums1stMethod);

        int[] nums2ndMethod = {1, 2, 3, 4, 5, 6};
        int k2 = 1;

        sol.rotateArray2ndMethod(nums2ndMethod, k2);

        System.out.println("Array after rotating elements by " + k2 + " places: ");
        printArray(nums2ndMethod);
    }
}
