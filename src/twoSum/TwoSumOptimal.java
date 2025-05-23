package twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimal {

    public int[] twoSum(int[] nums, int target) {
        // OPTIMAL APPROACH
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans= new int[2];

        for(int i=0;i<nums.length;i++) {
            int complement = target-nums[i];
            if(map.containsKey(complement)) {
                ans[0] = i;
                ans[1] = map.get(complement);
                return ans;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        TwoSumOptimal sol = new TwoSumOptimal();
        int[] ans = sol.twoSum(nums, target);

        System.out.println("This is the answer: [" + ans[0] + ", " + ans[1] + "]");
    }

}
