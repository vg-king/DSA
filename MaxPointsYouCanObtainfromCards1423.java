public class MaxPointsYouCanObtainfromCards1423 {
  public int maxScore(int[] cardPoints, int k) {
    int lsum =0,rsum=0,maxSum=0;
    for (int i = 0; i < k; i++) {
        lsum +=cardPoints[i];
    }
    maxSum = lsum;
    rsum = cardPoints.length-1;
    for (int i = k; i >=0; i--) {
        lsum = lsum-cardPoints[i];
        rsum +=cardPoints[rsum];
        maxSum = Math.max(maxSum, lsum+rsum);
    }
    return maxSum;
    }

    public static void main(String[] args) {
        
    }
}