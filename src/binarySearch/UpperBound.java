package binarySearch;

public class UpperBound {

    //upper bound -  first element in the array that is greater than 𝑥

    public int upperBound(int[] nums,  int x) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int x = 2;

        UpperBound sol = new UpperBound();

        int ind = sol.upperBound(arr, x);

        System.out.println("The lower bound is the index: " + ind);
    }

}
