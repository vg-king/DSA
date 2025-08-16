import java.util.Scanner;

public class JewelStonesCounter {
    public static int jewelCounter(String jewel, String stones) {
      
        char[] str1 = jewel.toCharArray();
        char[] str2 = stones.toCharArray();
        int count = 0;

        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter jewls");
        String jewel = sc.nextLine(); 
        System.out.println("Enter stones");
        String stones = sc.nextLine();
        System.out.println(jewelCounter(jewel, stones)); 
    }
}
