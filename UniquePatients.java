import java.util.*;

public class UniquePatients {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        Set<String> uniqueVowelNames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next().toLowerCase();
            char firstChar = name.charAt(0);
            if (isVowel(firstChar)) {
                uniqueVowelNames.add(name); 
            }
        }

       
        System.out.println(uniqueVowelNames.size());
        for (String name : uniqueVowelNames) {
            System.out.println(name);
        }

        sc.close();
    }

    // Helper to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
