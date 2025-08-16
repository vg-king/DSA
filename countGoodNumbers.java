public class countGoodNumbers {
    class Solution {
        public double power(int x,long n){
            return Math.pow(x, n);
        }
    public int countGoodNumbers(long n) {
        if (n%2==0) {
           return (int) ((power(5, n/2))*power(4, n/2));
        }
        return (int) ((power(5, n/2+1)*power(4, n/2)));
    }
}
    public static void main(String[] args) {
        
    }
}
