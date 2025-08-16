import java.util.List;
import java.util.ArrayList;

public class KeyBoardCombination {
    public static List<String> letterCombinations(String digits) {
        
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result; 
        }

        String[] mapping = new String[]{
            "",     
            "",     
            "abc",  
            "def",  
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz"  
        };

        backtrack(result, digits, 0, new StringBuilder(), mapping);
        return result;
    }

    public static void backtrack(List<String> result, String digits, int index, StringBuilder current, String[] mapping) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, digits, index + 1, current, mapping);
            current.deleteCharAt(current.length() - 1); 
        }
    }

    
    public static void main(String[] args) {
        
        System.out.println(letterCombinations("23")); 
        System.out.println(letterCombinations(""));   
        System.out.println(letterCombinations("2"));  
    }
}
