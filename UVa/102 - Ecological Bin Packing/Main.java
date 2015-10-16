import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int[] bins = new int[9];
    while (in.hasNext()){
      bins = fillBins(in);
      // first number orientation number (0 = BGC ... 5 = GBC)
      // second number is the amount of moves.
      int[] result = new int[2];
      result = {0,0};
      for(int i = 0; i < 6; i++){
        int moveCount = countMoves(i);
        if (result[1] >= moveCount){
           result =   {i, moveCount};
        }

      }
    }

  }

  private static int[] fillBins(Scanner in){
    int[] bins = new int[9];
    for (int bin: bins){
      bin = in.nextInt();
    }
    return bins;
  }

}
