import java.util.Scanner;

class Main {
  // UVa Online judge problem 11172 - Relation Operator
  // NOTE: class name has to be "Main" for proper compilation.
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);

    int cases = in.nextInt();
    //Store all results
    String[] results = new String[cases];
    for (int i=0 ; i < cases; i++){
      long a;
      long b;

      // Obtain comparison numbers
      a = in.nextLong();
      b = in.nextLong();

      // Determine result;
      if(a < b) results[i] = "<";
      if(a > b) results[i] = ">";
      if(a == b) results[i] = "=";


    }
    // Print solution
    for(String res : results){
      System.out.println(res);
    }
    in.close();
    System.exit(0);
  }
}
