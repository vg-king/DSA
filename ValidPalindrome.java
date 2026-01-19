
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return rev.equals(s);
    }
    
}
