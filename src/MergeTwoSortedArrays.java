import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int n = 8, m = 4;
		int arr1[] = { 1, 2, 3, 6, 7, 8, 9, 10 };
		int arr2[] = { 4, 5, 11, 12 };
		ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
		System.out.println("Union of arr1 and arr2 is ");
		for (int val : Union)
			System.out.print(val + " ");
		
		int size = Union.size();
		float median;
		System.out.println(size);
		
		if(size%2==0) {
			float first = Union.get((int) (size/2));
			float second = Union.get((int) ((size/2) -1));
			median = (first+second)/2;
		} else {
			median = Union.get((int) size/2);
		}
		
		System.out.println(median);
	}

	private static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
		// TODO Auto-generated method stub
		List<Integer> union = new ArrayList<>();
		
		int i=0, j=0;
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				union.add(arr1[i]);
				i++;
			} else if(arr2[j]<arr1[i]) {
				union.add(arr2[j]);
				j++;
			}
		}
		
		while(j<m) {
			union.add(arr2[j]);
			j++;
		}
		
	   while(i<n) {
			union.add(arr1[i]);
			i++;
		}
		
		return (ArrayList<Integer>) union;
	}

}
