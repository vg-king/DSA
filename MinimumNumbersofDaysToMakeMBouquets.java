public class MinimumNumbersofDaysToMakeMBouquets {
    class Solution {
        public int findMax(int piles[]){
            int maxi = Integer.MIN_VALUE;
            int n = piles.length;
            for (int i = 0; i < n; i++) {
                maxi = Math.max(maxi, piles[i]);
            }
            return maxi;
        }
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int maxNum = findMax(bloomDay);
            
            if (bloomDay[i]<=maxNum) {
                arr[i]=1;
            }else{
                arr[i] = 0;
            }

        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==1) {
                count++;
            }
            if (count<=3) {
                count = 0;
                break;
            }
        }
        return count;
    }
}
    public static void main(String[] args) {
        
    }
}
