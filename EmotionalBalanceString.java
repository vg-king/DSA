import java.util.*;
public class EmotionalBalanceString{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String s = sc.nextLine();
    Map<Character,Integer> map =new HashMap<>();
    for(char ch:s.toCharArray()){
      map.put(ch,map.getOrDefault(ch,0)+1);
      
    }
    Set<Integer> set = new HashSet<>(map.values());
    if(set.size()==1){
      System.out.println("Aashiriya smiles:Emotional balance found");
      
    }
    else{
      System.out.println("Aashriya wonders: These thoughts were scatteres");
    }
  }
}