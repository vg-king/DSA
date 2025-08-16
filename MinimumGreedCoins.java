public class MinimumGreedCoins {
    class Solution {
    public int MinimumCoins(int[] coins, int amount) {
        int sum = 0,count=0;
        for (int i = coins.length-1; i >0; i--) {
            if (coins[i]<amount) {
                if (sum<amount) {
                    while (sum<amount) {
                        sum+=coins[i];
                        count++;
                    }
                }else{i--;
                }
            }if (sum==amount) {
                break;
            }
        }
        return count;
    }
}

    public static void main(String[] args) {
        
    }
}
