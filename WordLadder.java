import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    class Pair{
        String first;
        int second;
        Pair(String first,int second){
            this.first= first;
            this.second = second;
        }
    }
    
    class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(beginWord, 1));
        Set<String> st = new HashSet<>();
        int len = wordList.size();
        for (int i = 0; i < len; i++) {
            st.add(wordList.get(i));
        }
        st.remove(beginWord);
        while (!queue.isEmpty()) {
            String word = queue.peek().first;
            int steps = queue.peek().second;
            queue.remove();
            if(word.equals(endWord)==true)return steps;
            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char replaceArray[] = word.toCharArray();
                    replaceArray[i]=ch;
                    String replaceword = new String(replaceArray);
                    if (st.contains(replaceword)==true) {
                        st.remove(replaceword);
                        queue.add(new Pair(replaceword, steps+1));
                    }
                }
            }
        }
        return 0;


    }
}
    
}
