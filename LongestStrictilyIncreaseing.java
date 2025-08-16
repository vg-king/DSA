import java.util.Scanner;

public class LongestStrictilyIncreaseing {
    public static int largestSubarray(int arr[]){
        int larArr = 1;
        int currArr = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[i-1]+1) {
                currArr++;
           
            if (currArr>larArr) {
                larArr = currArr;
            }
        }
            else{
                currArr = 1;
            }
        }
        return larArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largestSubarray(arr));
    }
}
