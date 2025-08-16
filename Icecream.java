class Icecream{
  public static boolean BuyIcecream(int budget,int icecream[]){
    for(int i: icecream){
      if(i==budget){
        return true;
      }
    }
      return false;
  }

public static void main(String[] args){
  int arr[] = {10,25,30,50};
  System.out.println(BuyIcecream(30,arr));
  }
}