import java.util.Scanner;

// UVa Online judge problem 494 - Kindergarten Counting Game
// I'm doubtful Kindergarten kids would know to count "\\\outl///ived"
// as two words....
// NOTE: class name has to be "Main" for proper compilation.
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Read while there are more lines.
    while(in.hasNext()){
        // Replace all non-whitespace, non-alphabet characters with whitespace.
        // Remove duplicate whitespace
        // Remove preceding and trailing whitespace
        // Split the string on each whitespace character and count the result.
        String[] words = in.nextLine().replaceAll("[^a-zA-Z ]", " ").replaceAll("\\s+"," ").trim().split(" ");
        System.out.println(words.length);
    }
  }
}
