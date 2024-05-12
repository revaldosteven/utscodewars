
import java.util.List;
import java.util.ArrayList; 

public class Kata { 
    
 public static List<Object> filterList(final List<Object> list) { 
    List<Object> newList = new ArrayList<>(list); 
    newList.removeIf(item -> item instanceof String); 
    return newList; 
  }
} 
