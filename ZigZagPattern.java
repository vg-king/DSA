import java.util.Scanner;

public class ZigZagPattern {
public static void zigzagMatrix(int val) {
    if (val > 10) {
      System.out.println("Abhik's marathon journey intensifies! Let's see his detail");
    }
    int num = 1;
    int total = 0;
    for (int i = 1; i <= val; i++) {
      
      for (int j = 1; j <= val - i; j++) {
        System.out.print("   ");
      }
      int row[] = new int[i];
      for (int j = 0; j < i; j++) {
        row[j] = num;
        num++;
        total++;
      } if (i % 2 == 1) {
        for (int j = 0; j < i; j++) {
          System.out.print(row[j] + "   ");
        }
      } else {
        for (int j = i - 1; j >= 0; j--) {
          System.out.print(row[j] + "   ");
        }
      }
      System.out.println(); 
    } System.out.println("Total numbers printed: " + total);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of days: ");
    int n = sc.nextInt();
    zigzagMatrix(n);
  }
}
