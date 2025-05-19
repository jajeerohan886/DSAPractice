public class MinimumInSortedRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8,9,10,1,2,3,4,5,6,7};
		int min = findMinInSortedRotatedArray(arr);
		System.out.println(min);
		
		int[] arr1 = {8,9,10,1,2,3,4,5,6,7};
		int max = findMaxInSortedRotatedArray(arr1);
		System.out.println(max);

	}
	 
	public static int findMinInSortedRotatedArray(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<high) {
			int mid = (low+high)/2;
			
			if(arr[mid] > arr[high]) {
				low=mid+1;
			} else if(arr[mid] < arr[high]) {
				high = mid;
			}
		}
		return arr[low];	
	}
	
	public static int findMaxInSortedRotatedArray(int[] arr) {
		
		int low = 0;
		int high = arr.length-1;
		
		while(low<high) {
			int mid = (low+high)/2;
			
			if(arr[mid] > arr[high]) {
				low=mid+1;
			} else if(arr[mid] < arr[high]) {
				high = mid;
			}
		}
		return arr[low-1];	
	}
}
