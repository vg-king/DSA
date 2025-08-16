import java.util.Scanner;

public class TargetCalorie {
  public static int subArr(int target, int arr[]) {
   int minLen = Integer.MAX_VALUE;
   int sum =0;
   int j = 0;
   for (int i = 0; i < arr.length; i++) {
    sum+=arr[i];
    while (sum>=target) {
      minLen = Math.min(minLen, i-j+1);
      sum-=arr[j];
      j++;
    }
   }
   return (minLen==Integer.MAX_VALUE)?0:minLen;
  }

  public static void main(String[] args) {
    int n = 7;
    int arr[] = { 2, 3, 1, 4, 3 };
    System.out.println(subArr(n, arr));
  }
}