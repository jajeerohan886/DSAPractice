public class DistanceBetweenTwoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";
        int index1=-1;
        int index2=-1;
        int minDistance = Integer.MAX_VALUE;
        
        String[] arr = str.split(" ");
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i].equals(word1)) {
        		index1=i;
        	} else if(arr[i].equals(word2)) {
        		index2=i;
        	}
        	
        	
        	if(index1!=-1 && index2!=-1) {
        		int distance = Math.abs(index1-index2);
        		minDistance = Math.min(minDistance, distance);
        	}
        }
        
        System.out.println(minDistance-1);
        
        index1=-1;
        index2=-1;
        minDistance = Integer.MAX_VALUE;
        str = "the quick the frog brown quick brown the frog";
        word1 = "quick";
        word2 = "frog";
        for(int i=0;i<arr.length;i++) {
        	if(arr[i].equals(word1)) {
        		index1=i;
        	}
        	
        	if(index1!=-1 && arr[i].equals(word2)) {
        		int distance = i-index1;
        		minDistance = Math.min(minDistance, distance);
        	}
        }
        System.out.println(minDistance-1);

	}
}
