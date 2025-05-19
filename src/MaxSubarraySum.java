public class MaxSubarraySum {
	
	public static void main(String[] args) {
		
		int[] arr = {-1,-2,-1,-2,-3,-1,-2,-3,-4,-5,-5,-10,0};
		int max = 0;
		MaxSubarraySum maxSubarraySum = new MaxSubarraySum();
		max = maxSubarraySum.maxSumOfSubarrayBruteForce(arr);
		System.out.println("BruteForceSum " + max);
		
//		max = maxSubarraySum.maxSumOfSubarrayPrefixSum(arr);
//		System.out.println("PrefixSum : " + max);
		
		max = maxSubarraySum.maxSumOfSubarrayKadanesAlgo(arr);
		System.out.println("Kadanes Algo Sum : " + max);
		
		
	}
	
	//Brute Force
    private int maxSumOfSubarrayBruteForce(int[] arr) {
		
    	int maxSumOfSubarray = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					sum = sum+arr[k];
				}
				maxSumOfSubarray=Math.max(maxSumOfSubarray, sum);
			}
		}
		return maxSumOfSubarray;
	}
    
    //Prefix Sum -- no working
    private int maxSumOfSubarrayPrefixSum(int[] arr) {
    	int maxSumOfSubarray = Integer.MIN_VALUE;
    	
    	int[] prefixSum = new int[arr.length];
    	prefixSum[0] = arr[0];
    	
    	for(int i=1;i<arr.length;i++) {
    		prefixSum[i] = prefixSum[i-1] + arr[i];
    	}
    	
    	for(int i=1;i<prefixSum.length;i++) {
//    		int currentSum = prefixSum[i] - minPrefixSum;
    		maxSumOfSubarray = Math.max(maxSumOfSubarray, prefixSum[i]);
    	}
    	
    	return maxSumOfSubarray;
	}
    
    //Kadanes algo - Optimal Approach
    private int maxSumOfSubarrayKadanesAlgo(int arr[]) {
		// TODO Auto-generated method stub
    	int currentSum = 0;
    	int maxSum = Integer.MIN_VALUE;
    	
    	for(int i=0;i<arr.length;i++) {
    		currentSum = arr[i] + currentSum;
    		maxSum = Math.max(currentSum, maxSum);
    		if(currentSum < 0) {
    			currentSum = 0;
    		}
    	}
    	return maxSum;
	}
    
    
}
