import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllThreeCharacters1358 {
    //  public int numberOfSubstrings(String s) {
    //     int i = 0,count =0 ;
    //     Map<Character,Integer> mpp = new HashMap<>();
    //     for (int j = i; j < s.length(); j++) {
    //         char c = s.charAt(j);
    //         mpp.put(c, mpp.getOrDefault(c, 0)+1);
    //        while (mpp.containsKey('a')&&mpp.containsKey('b')&&mpp.containsKey('c')) {
    //         count+=s.length();
    //         char l = s.charAt(i);
    //         mpp.put(l, mpp.get(l)-1);
    //         if (mpp.get(l)==0) {
    //             mpp.remove(l);
    //         }
    //         i++;
    //        }

    //     }
    //     return count;
    //  }
public int numberOfSubstrings(String s) {
    int[] lastseen = new int[3];
    Arrays.fill(lastseen, -1);
    int count = 0;
    char[] c = s.toCharArray();

    for (int i = 0; i < s.length(); i++) {
        lastseen[c[i] - 'a'] = i;

        if (lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != -1) {
            
            int minLastSeen = Math.min(lastseen[0], Math.min(lastseen[1], lastseen[2]));
            count += minLastSeen + 1;
        }
    }

    return count;
}

    public static void main(String[] args) {
        
    }
}
