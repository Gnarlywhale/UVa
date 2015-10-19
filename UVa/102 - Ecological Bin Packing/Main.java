import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int[] bins = new int[9];
    while (in.hasNext()){
      bins = fillBins(in);
      /*
        0 1 2
        4 5 6
        7 8 9
      */
      /*
        1 2 3
        4 5 6
        7 8 9

        B:4+7
        G:7
        C:3+9
      */

      int[] results = new int[6];
      results[0] = moveCount(bins, 0, 5, 9);
      results[1] = moveCount(bins, 0, 6, 8);
      results[2] = moveCount(bins, 1, 4, 9);
      results[3] = moveCount(bins, 1, 6, 7);
      results[4] = moveCount(bins, 2, 4, 8);
      results[5] = moveCount(bins, 2, 5, 7);

      // Find lowest
      int lowest = 0;
      for (int i = 1; i < 6; i++){
        if (results[i] <= results[lowest]){
          lowest = i;
        }
      }
      // for(int res: results){
      //   System.out.println(res);
      // }
      switch (lowest){
        case 0: System.out.println("BGC "+results[lowest]);
                break;
        case 1: System.out.println("BCG "+results[lowest]);
                break;
        case 2: System.out.println("GBC "+results[lowest]);
                break;
        case 3: System.out.println("CBG "+results[lowest]);
                break;
        case 4: System.out.println("GCB "+results[lowest]);
                break;
        case 5: System.out.println("CGB "+results[lowest]);
                break;
}
    }

  }

  private static int moveCount(int[] bins, int bIdx, int gIdx, int cIdx){
    int moves = 0;
    for (int i = 0; i < 9; i++){
      if (i != bIdx && i != gIdx && i != cIdx){
        moves += bins[i];
      }
    }
    return moves;
  }

  private static int[] fillBins(Scanner in){
    int[] bins = new int[9];
    for (int bin = 0; bin < 9; bin++){
      bins[bin] = in.nextInt();

    }
    return bins;
  }

}
