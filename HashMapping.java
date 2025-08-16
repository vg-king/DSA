import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //preCount
        Map<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
        }
        int q = sc.nextInt();
        while (q-->0) {
            int number = sc.nextInt();
            System.out.println(mpp.getOrDefault(number, 0));
        }
        
        
    }
}
