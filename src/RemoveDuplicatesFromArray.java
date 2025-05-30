import java.util.Arrays;
import java.util.Objects;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        String[] s = {"abc", "bcd","abc","dcd"};

        Arrays.sort(s); // {"abc", "abc", "bcd","dcd"};

        int j=1, i=0;
        while(j<s.length) {
            if(!s[i].equals(s[j])) {
                i++;
                s[i]=s[j];
            }
            j++;
        }

        for(int k=0;k<=i;k++) {
            System.out.println(s[k]);
        }
    }

}
