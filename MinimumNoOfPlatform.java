public class MinimumNoOfPlatform {
    class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        int platform = 0;
        int i=0;
        while (i<Arrival.length&&i<Departure.length) {
            if (Arrival[i]<Departure[i-1]) {
                platform++;
            }
        }
        return platform;
    }
}
}
