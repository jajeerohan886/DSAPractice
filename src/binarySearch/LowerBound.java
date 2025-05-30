package binarySearch;

public class LowerBound {

    //lower bound -  first element in the array that is greater than or equal to 𝑥

    public int lowerBound(int[] nums,  int x) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] >= x) {
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

        LowerBound sol = new LowerBound();

        int ind = sol.lowerBound(arr, x);

        System.out.println("The lower bound is the index: " + ind);
    }
}
