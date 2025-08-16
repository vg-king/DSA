import java.util.*;

public class SimpleRabinKarpp {
    public static List<Integer> findPattern(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        int n = text.length(), m = pattern.length();
        if (m > n) {
            result.add(0);
            return result;
        }

        int base = 256;
        int mod = 1000000007;

        long pHash = 0, tHash = 0, power = 1;

        // Compute hash of pattern and first window
        for (int i = 0; i < m; i++) {
            pHash = (pHash * base + pattern.charAt(i)) % mod;
            tHash = (tHash * base + text.charAt(i)) % mod;
            if (i < m - 1) power = (power * base) % mod;
        }

        for (int i = 0; i <= n - m; i++) {
            if (pHash == tHash && text.substring(i, i + m).equals(pattern)) {
                result.add(i);
            }

            // Slide window
            if (i < n - m) {
                tHash = (tHash - text.charAt(i) * power) % mod;
                tHash = (tHash * base + text.charAt(i + m)) % mod;
                if (tHash < 0) tHash += mod;
            }
        }

        if (result.isEmpty()) result.add(0);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findPattern("thisresearchworkisunique", "search")); // [6]
        System.out.println(findPattern("wehavereceivednoothermatch", "copy"));  // [0]
    }
}
