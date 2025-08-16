public class MissingNumber {
    public static int missingNumber(int arr[]){
        int n = arr.length;
        int xor1=0,xor2=0;
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
      
        return xor1^xor2;
    }
    
   public static void main(String[] args) {

   } 
}
