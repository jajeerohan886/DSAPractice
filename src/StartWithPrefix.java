import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartWithPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"apple", "applet", "bread", "aper"};
	    String prefix = "app";
	    List<String> output = new ArrayList<>();
	    
//	    for(String s : arr) {
//	    	if(s.startsWith(prefix)) {
//	    		output.add(s);
//	    	}
//	    }
//	    
//	    System.out.println(output.toString());
	    
	    
	    List<Boolean> result = Arrays.stream(arr).map(x->(x.startsWith(prefix)?output.add(x):null)).toList();
	    System.out.println(output.toString());
	    

	}

}
