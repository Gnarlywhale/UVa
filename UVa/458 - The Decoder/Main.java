import java.io.DataInputStream;
import java.io.IOException;

// UVa Online judge problem 458 - The Decoder.
// NOTE: class name has to be "Main" for proper compilation.
// NOTE: Scanner was tricky to work with in order to get a UVa accepted answer,
//       I believe it was skipping over the necessary non-printable chars so
//       I used a straight DataInputStream instead.
class Main{

  public static void main (String[] args) throws IOException{

    DataInputStream in = new DataInputStream(System.in);

    int temp;
    while ((temp = in.read()) != -1){
      // If the captured char is an ascii printable char, print out the corresponding
      // char minus 7 (the cypher).
      System.out.print((Character.isWhitespace((char)temp))? (char)temp : (char)(temp-7));
    }
    in.close();
    System.exit(0);
  }
}
