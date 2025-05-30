/*
package binarySearch;

public class SearchInSortedRotatedArray {

    public int linearSearch(int[] nums, int k) {

        for(int i=0;i<nums.length;i++) {
            if (nums[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int k) {
        int low = 0, high = nums.length-1;
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(nums[mid] == k) {
                return mid;
            }

            else if(nums[low] <= nums[mid]) {
                if(nums[low] < k < nums[mid]) {
                    low = mid+1;
                }
            } else if(nums[mid] <= nums[high]) {
                if(nums[mid] < k < nums[high]) {
                    high = mid-1;
                }
            }

        }


    }

    public static void main(String[] args) {
        int nums[] = {7,8,9,1,2,3,4,5,6};

        int k = 8;

        SearchInSortedRotatedArray searchInSortedRotatedArray = new SearchInSortedRotatedArray();
        int index = searchInSortedRotatedArray.linearSearch(nums, k);

        if(index >= 0) {
            System.out.println(k + " found at index " + index);
        } else {
            System.out.println(k + " not found in the array");
        }
    }
}
*/
