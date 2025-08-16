import java.util.Scanner;

public class HasingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();  // string input
        
        int[] hash = new int[26];  // 26 letters ke liye (a to z)

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        int q = sc.nextInt();  // number of queries
        while (q-- > 0) {
            char c = sc.next().charAt(0);  // single character input
            System.out.println(hash[c - 'a']);
        }
    }
}
