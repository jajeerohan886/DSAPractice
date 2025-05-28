package threeSumProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimalApproach {

    // Find Triplets whose sum is zero and these triplets should be distinct
    public List<List<Integer>> threeSum(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> triplets = new ArrayList<>();

        for(int i=0;i<arr.length;i++) {

            if(i>0 && arr[i] == arr[i-1]) continue;

            int j=i+1, k=arr.length-1;
            int sum = 0;

            while(j<k) {
                sum = arr[i] + arr[j] + arr[k];
                if(sum > 0) {
                    k--;
                } else if(sum < 0) {
                    j++;
                } else {
                    // Triplet Found
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    triplets.add(list);
                    j++;
                    k--;

                    //Skipping duplicates
                    while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        return triplets;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Create an instance of Solution class
        OptimalApproach sol = new OptimalApproach();

        List<List<Integer>> ans = sol.threeSum(nums);

        // Print the result
        for (List<Integer> triplet : ans) {
            System.out.print("[");
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}

