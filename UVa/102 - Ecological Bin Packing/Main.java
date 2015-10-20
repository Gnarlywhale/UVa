import java.util.Scanner;

// UVa Online judge problem 102 - Ecological Bin Packing
// NOTE: class name has to be "Main" for proper compilation.
class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    // Store the bottle positions
    int[] bins = new int[9];
    while (in.hasNext()){
      bins = fillBins(in);
      /* Representation of bottle amounts per bin.
           1      2       3
        B G C | B G C | B G C
        0 1 2 | 3 4 5 | 6 7 8
      */
      // Store results
      int[] results = new int[6];

      // Find move counts for each possible orientation
      results[0] = moveCount(bins, 1,5,6); //GCB
      results[1] = moveCount(bins, 1,3,8); //GBC
      results[2] = moveCount(bins, 2,4,6); //CGB
      results[3] = moveCount(bins, 2,3,7); //CBG
      results[4] = moveCount(bins, 0,4,8); //BGC
      results[5] = moveCount(bins, 0,5,7); //BCG

      // Find Lowest move count
      int lowest = 0;
      for (int i = 1; i < 6; i++){
        if (results[i] <= results[lowest]){
          lowest = i;
        }
      }
      // Display answer
      switch (lowest){
        case 0: System.out.println("GCB "+results[lowest]);
                break;
        case 1: System.out.println("GBC "+results[lowest]);
                break;
        case 2: System.out.println("CGB "+results[lowest]);
                break;
        case 3: System.out.println("CBG "+results[lowest]);
                break;
        case 4: System.out.println("BGC "+results[lowest]);
                break;
        case 5: System.out.println("BCG "+results[lowest]);
                break;
}
    }

  }

  // Calculate the required amount of moves to
  private static int moveCount(int[] bins, int x, int y, int z){
    int moves = 0;
    // Ignore the indexes of bottles that don't need to be moved
    for (int i = 0; i < 9; i++){
      if (i != x && i != y && i != z){
        moves += bins[i];
      }
    }
    return moves;
  }
  // Read in initial bin orientation.
  private static int[] fillBins(Scanner in){
    int[] bins = new int[9];
    for (int bin = 0; bin < 9; bin++){
      bins[bin] = in.nextInt();

    }
    return bins;
  }

}
