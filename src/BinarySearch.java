public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        return binarySearchHelper(arr, low, high, target);
    }

    public static int binarySearchHelper(int[] arr, int low, int high, int target) {
        int mid = (low+high) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[mid] < target) {
            low = mid+1;
        } else {
            high = mid-1;
        }
        return binarySearchHelper(arr, low, high, target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int target = 1;

        int index = binarySearch(arr, target);

        System.out.println("Target is at index : " + index);
    }
}
