public class kadanesAlgoSubarrayMaxSum {

    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE, sum = 0;
        int startIndex = -1, endIndex = -1;
        int maxLength = Integer.MIN_VALUE, minLength = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++) {
            if(sum == 0) {
                startIndex = i;
            }
            sum += nums[i];
            if(maxSum <= sum) {
                maxSum = sum;
                endIndex = i;

                maxLength = Math.max(maxLength, endIndex-startIndex+1);
                minLength = Math.min(minLength, endIndex-startIndex+1);
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        System.out.println("MaxSum " + maxSum);
        System.out.println("StartIndex " + startIndex);
        System.out.println("endIndex " + endIndex);
        System.out.println("MaxLength " + maxLength);
        System.out.println("MinLength " + minLength);

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4, -5, 6 };

        // Create an instance of Solution class
        kadanesAlgoSubarrayMaxSum sol = new kadanesAlgoSubarrayMaxSum();

        int maxSum = sol.maxSubArray(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
    }

}
