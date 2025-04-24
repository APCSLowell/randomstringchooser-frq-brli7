import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private ArrayList<String> words = new ArrayList<String>();
  public RandomStringChooser(String[] strings) {
    for(int i = 0; i < strings.length; i++) {
      words.add(strings[i]);
    }
  }
  public String getNext() {
    int index = (int)(Math.random()*words.size());
    String temp = words.get(index);
    words.remove(index);
    return temp;
  }
}
