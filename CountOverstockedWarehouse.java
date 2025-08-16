import java.util.Scanner;

public class CountOverstockedWarehouse {
    public static int countWarehouse(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j]>=100) {
                    count++;
                }
            }
            if (count>=3) {
              count1++;  
            }
        }
        return count1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int arr[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
                
            }
        }
        System.out.println(countWarehouse(arr));
    }

}
