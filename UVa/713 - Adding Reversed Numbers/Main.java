import java.util.Scanner;
// UVa Online judge problem 713 - Adding Reversed Numbers
// NOTE: class name has to be "Main" for proper compilation.
class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    // Number of test cases
    int cases = in.nextInt();
    // Array to store the resulting cases.
    StringBuilder[] results = new StringBuilder[cases];

    // "x" is the first number and "y" is the second number
    String x;
    String y;
    // "carry" tracks if the sum of any two digits is 10 or more.
    int carry;
    for (int i = 0; i < cases; i++){
      // Store both reversed numbers as strings
      x = in.next();
      y = in.next();
      carry = 0;
      int j = 0;
      // Initialize empty result
      results[i] = new StringBuilder("");
      // Add digits of both numbers together until one number (or both) runs out
      // of additional digits.
      for (; j < x.length() && j < y.length(); j++){

        int sum = Character.getNumericValue(x.charAt(j)) + Character.getNumericValue(y.charAt(j)) + carry;
        // Append the right-most digit of sum
        results[i].append(""+sum%10);
        // Store the carry
        carry = (sum >= 10)? 1 : 0;
      }
      // Store the letters of the string with remaining numbers
      String rest = (j < x.length())? x.substring(j,x.length()) : y.substring(j,y.length());

        // Add the carry through to the rest of the string.
        for (int z = 0; z < rest.length(); z++){
          int sum = Character.getNumericValue(rest.charAt(z)) + carry;

          results[i].append(""+sum%10);

          carry = (sum >= 10)? 1 : 0;
        }
        // Add the final carry value if it's not zero
        if (carry != 0) results[i].append(""+carry);
        // Remove extra zeros
        if (results[i].charAt(0) == '0'){
          int last0 = 0;
          while(results[i].charAt(last0) == '0') last0++;
          results[i] = new StringBuilder(results[i].substring(last0,results[i].length()));
        }
    }
    // Print result and exit
    for (StringBuilder res : results)
    System.out.println(res);
    System.exit(0);
  }

}
