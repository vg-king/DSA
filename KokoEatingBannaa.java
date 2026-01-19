class Solution {
    int totalHourLeft(int piles[],int h,int k){
        int sum=0;
        for (int i = 0; i < piles.length; i++) {
            sum+=Math.ceil(piles[i]/k);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, i);
        }
        int k[] = new int[max];
        for (int i = 1; i < max; i++) {
            k[i] = i;
        }
        int low = 0,high = k.length-1;
        int ans = max;
        while (low<=high) {
            int mid = (low+high)/2;
           int totalH = totalHourLeft(piles, high, mid);
            if(totalH<=h) ans=mid;
            else low=mid+h; 
        }
        return ans;
    }
}
public class KokoEatingBannaa {
    
}
