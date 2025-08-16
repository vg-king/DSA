import java.util.Scanner;
public class Archery{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int goodShot = 0;
    int missedShot = 0;

    for(int i = 0;i<n;i++){
      int score = sc.nextInt();
      if(score>=7){
        goodShot++;
      }else{
        missedShot++;
      }
      
    }
    System.out.println(goodShot+" "+missedShot);
  }
}