import java.util.*;
import java.io.*;

// UVa Online judge problem 10055 - HashMat the Brave Warrior.
// NOTE: class name has to be "Main" for proper compilation.
class Main{
  public static void main(String[] args){
    // Initialize variables;
    Scanner in = new Scanner(System.in);
    StringBuilder result = new StringBuilder();
    String temp;
    // "open" tracks if the currently found quote char is the openning or closing
    // quote.
    Boolean open = true;
    // Use scanner to read every line, appending a newline char at the end of every one.
    while(in.hasNextLine()){

      // Store the newline to search through for quote chars
      temp = in.nextLine();
      // Check each char to see if it's a quote, if so replace with appropriate
      // `` (opening) or '' (closing).
      for(int i = 0; i < temp.length(); i ++){
        if (temp.charAt(i) == '\"'){
          String ans = (open)? "``" : "''";
          result.append(ans);
          open = !open;
        } else {
          result.append(temp.charAt(i));
        }
      }
      result.append("\n");
    }
    // Print out the resuting replaced string.
    System.out.print(result);
    in.close();
    System.exit(0);
  }
}
