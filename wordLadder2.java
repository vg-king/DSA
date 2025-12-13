import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Pair {
    String first;
    int second;

    Pair(String first, int second) {
        this.first = first;
    }
}

class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> st = new HashSet<>();
        int len = wordList.size();
        for (int i = 0; i < len; i++) {
            st.add(wordList.get(i));
        }
        Queue<ArrayList<String>> queue = new LinkedList<>();
        ArrayList<String> ls = new ArrayList<>();
        ls.add(beginWord);
        queue.add(ls);
        ArrayList<String> usedOnLevel = new ArrayList<>();
        usedOnLevel.add(beginWord);
        int level = 0;
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            ArrayList<String> vec = queue.peek();
            queue.remove();
            if (vec.size()>level) {
                level++;
                for (String it :usedOnLevel) {
                    st.remove(it);
                }
            }
            String word = vec.get(vec.size()-1);
            if (word.equals(endWord)) {
                if (ans.size()==0)  {
                    ans.add(vec);
                }else if (ans.get(0).size()==vec.size()) {
                    ans.add(vec);
                }
            }
            for (int i = 0; i < word.length(); i++) {
                for (char c = 'a'; c<='z'; c++) {
                    char replacChareArray[] = word.toCharArray();
                    replacChareArray[i] = c;
                    String replaceWord = new String();
                    if (st.contains(replaceWord)==true) {
                        vec.add(replaceWord);
                        ArrayList<String> temp = new ArrayList<>();
                        queue.add(temp);
                        usedOnLevel.add(replaceWord);
                        vec.remove(vec.size()-1);
                    }
                }
            }
        }
        return ans;

        
    }
}

public class wordLadder2 {

}
