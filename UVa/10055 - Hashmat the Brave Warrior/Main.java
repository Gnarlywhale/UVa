import java.util.*;
import java.io.*;

// UVa Online judge problem 10055 - HashMat the Brave Warrior.
// NOTE: Need to use long type numbers.
// NOTE: class name has to be "Main" for proper compilation.
public class Main {

  public static void main(String[] args){
  	// Initialize io objects
  	Scanner in = new Scanner(System.in);

    // Read in the next numbers
    while(in.hasNextLong()){

      long x= 0;
      long y= 0;
      x = in.nextLong();
      if(in.hasNextLong()){
      y = in.nextLong();
      } else {
        break;
      }
      // Printo out the absolute difference
      System.out.println(Math.abs(x-y));
    }
    in.close();

    System.exit(0);
  }

}
