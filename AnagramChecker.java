import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramChecker{
    public static String sortString(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static List<Integer> anagramDector(String log,String pattern){
        List<Integer> list = new ArrayList<>();
        String sortPattern = sortString(pattern);
        for (int i = 0; i <= log.length()-pattern.length(); i++) {
            String subString = log.substring(i, i+pattern.length());
            if (sortString(subString).equals(sortPattern)) {
                list.add(i);
            }
        }
        return list;
    }
  public static void main(String []args){
    String l1 = "cbaebabacd";
    String p1 = "abc";
    String l2 = "abab";
    String p2 = "ab";
   System.out.println( anagramDector(l1, p1));
       System.out.println( anagramDector(l2, p2));
  }
}