import java.util.Stack;

public class LemonadeChange {
      public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,twenty=0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i]==5) {
                five++;
            }else if (bills[i]==10) {
                if (five>0) {
                    
                    ten++;
                    five--;
                    return true;
                }
            }else if (bills[i]==20) {
                if (five==3) {
                    twenty++;
                    five--;
                    return true;
                }else if (five>=1&&ten>=1) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
