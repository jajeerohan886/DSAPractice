package twoSum;

public class TwoSumBruteForce {
    public int[] twoSum(int[] nums, int target) {
        // BRUTE FORCE
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        TwoSumBruteForce sol = new TwoSumBruteForce();
        int[] ans = sol.twoSum(nums, target);

        System.out.println("This is the answer: [" + ans[0] + ", " + ans[1] + "]");
    }
}
