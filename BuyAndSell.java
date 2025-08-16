import java.util.Scanner;

public class BuyAndSell{
  public static int profit(int arr[]){
    int min = arr[0],profit = 0;
    int cost = 0;
    for(int i = 1;i<arr.length;i++){
      cost = arr[i]-min;
      profit  = Math.max(profit,cost);
      min = Math.min(min,arr[i]);
      
    }
    if(profit>=2){
      return profit;
    }else{
      return 0;
    }
  }
  public static void main(String []args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the no");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println(profit(arr));
    Stirng str;
    
  }
}