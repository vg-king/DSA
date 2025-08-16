import java.util.Scanner;

public class MovmentTracker {
  public static int segmentCounter(String binary) {
    char[] str = binary.toCharArray();
    int count = 0;
    for (int i = 0; i < str.length; i++) {
      if (str[i] == '1' && (i == 0 || str[i - 1] == '0')) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String result = sc.nextLine();
    System.out.println(segmentCounter(result));  
  }
}
