class Solution {
    public int[] convert(int n){
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;

        }
        return arr;
    } 
    public int countPrimes(int n) {
        int arr[] = new int[n];
        arr = convert(n);
        for (int i = 2; i < Math.sqrt(n); i++) {
            for (int j = i*i; j < n; j+=i) {
                arr[j]=0;
            }
        }
        for (int i = 2; i < n; i++) {
            if (arr[i]==1) {
                return i;
            }
        }
        return 0;
    }
}
public class CountPrimes {
    
    public static void main(String[] args) {
        
    }
}
