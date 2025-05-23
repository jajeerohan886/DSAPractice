package threeSumProblem;

import java.util.*;

public class BruteForce {

    public List<List<Integer>> threeSum(int[] arr) {

        // BRUTE FORCE
        Set<List<Integer>> tripletSet = new HashSet<>();

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                for(int k=j+1;k<arr.length;k++) {
                    if(arr[i]+arr[j]+arr[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        Collections.sort(triplet);
                        tripletSet.add(triplet);
                    }
                }
            }
        }
        return new ArrayList(tripletSet);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Create an instance of Solution class
        BruteForce sol = new BruteForce();

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
