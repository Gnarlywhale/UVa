import java.util.*;
import java.io.*;

// UVa Online judge problem 10071 - Back to HighSchool Physics
// NOTE: class name has to be "Main" for proper compilation.
class Main {

	public static void main(String[] args){

		// Initialize io objects
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);

		// Run for as Int as input is an integer
		while(in.hasNextInt()){

			int v= 0;
			int t= 0;
			v = in.nextInt();
			if(in.hasNextInt()){
			t = in.nextInt();
			} else{
				break;
			}
			System.out.println(v*(t*2));
		}

		in.close();
		out.close();
		System.exit(0);
	}


}
