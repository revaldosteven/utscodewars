
public class DRoot { 
    
  public static int digital_root(int n) { 
    if( n < 10 ) 
      return n; 
    else 
      return digital_root( n%10 + digital_root(n/10) ); 
  }
}
