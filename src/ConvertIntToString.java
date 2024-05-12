
public class ConvertIntToString {
    
  public static String numberToString(int num) { 
  	String res = ""; 
    while (num != 0) { 
    	int mod = num % 10; 
      res = String.valueOf(mod) + res; 
      num = num / 10; 
    }
  	return res; 
  }
}
