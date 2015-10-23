import java.util.Scanner;
import java.util.Arrays;

// UVa Online judge problem 10038 - Jolly Jumper
// NOTE: class name has to be "Main" for proper compilation.
class Main{
    public static void main(String[] args){
      Scanner in = new Scanner (System.in);
      // Continue evaluation while values being passed in.
      while(in.hasNext()){
        // Determine amount of elements to compare
        int n = in.nextInt();

        // Store the difference between every element and it's neighbour
        int[] res = new int[n-1];
        Boolean jolly = true;
        int x = in.nextInt();
        for (int i = 0; i < n-1; i++){

          int y = in.nextInt();
          res[i] = Math.abs(x-y);

          x = y;
        }
        // Sort the array of differences
        Arrays.sort(res);
        for (int i = 0; i < n-1; i++){
          // Ensure the array meets the criteria for a Jolly Jumper
          if(res[i] != i+1){
          jolly = false;
          break;
        }
        }
        // Print output
        if (jolly) System.out.println("Jolly");
        if (!jolly) System.out.println("Not jolly");
      }
    }
}
