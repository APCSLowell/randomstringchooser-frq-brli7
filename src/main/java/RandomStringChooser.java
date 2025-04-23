import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private String[] words;
  public RandomStringChooser(String[] strings) {
    words = string;
  }
  public String getNext() {
    boolean hasAvailable = false;
    for(int i = 0; i < words.length; i++) {
      if(words[i] != null) {
        hasAvailable = true;
      }
    }
    int index = (int)(Math.random()*(words.length-1));
    if(!hasAvailable) {
      return "NONE";
    }
    while(words[index] == null) {
      index = (int)(Math.random()*(words.length-1));
    }
    String temp = words[index];
    words[index] = null;
    return temp;
}
