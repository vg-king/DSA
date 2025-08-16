import java.util.Scanner;

public class CleanSpeech{
  public static String cleanSpeech(String str){
    String [] words = str.split(" ");
    String [] newWord = new String[words.length];
    for(int i= 0;i<words.length;i++){
      newWord[i] = words[words.length-1-i];
    }
    return String.join(" ", newWord);
  }
  public static void main(String []args){
    String str = "i am coding daily in codesprint";
    String str2 = "there is no heart for me like yours";
    System.out.println(cleanSpeech(str));
    System.out.println(cleanSpeech(str2));
  }
}