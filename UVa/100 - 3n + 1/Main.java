import java.util.*;
import java.io.*;

// UVa Online judge problem 100 - The 3n + 1 problem.
// NOTE: class name has to be "Main" for proper compilation.
public class Main {

	public static void main(String[] args){

		// Initialize io objects
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);

		// Create a hasmap dictionary of cycle lengths for each number to limit amount of times the length is calculated.
		Map<Long, Long> cycleMap =  new HashMap<Long, Long>();

		// Run for as long as input is an integer
		while(in.hasNextLong()){

			long i= 0;
			long j= 0;
			i = in.nextLong();
			if(in.hasNextInt()){
			j = in.nextLong();
			} else{
				break;
			}
			long max = 0;

			//Determine start and end numbers
			long start = (i>j)?j:i;
			long finish = (i>j)?i:j;



			// for every number between i and j, first see if cycle length is in cycleMap, if so print that value
			// if not, calculate cycle length for the number.
			for (long target = start; target <= finish; target++){
				long cycleLength = -1;

				// Check if the current target's cycle length has already been calculated
				if(cycleMap.containsKey(target)){
					// Cycle length has already been calculated
					cycleLength = cycleMap.get(target);

				} else {
					// Calculate new cycle length
					cycleLength = cycleLength(target);
					// Insert new number into map
					cycleMap.put(target, cycleLength);

				}
				// Update the max cycle length if the new cycle length is larger
				max = (max<cycleLength)? cycleLength:max;

			}
			// Display output
			// System.out.println(start + " "+ finish + " " + max);
			// NOTE: The above is an incorrect output, the output order must match the input order (I fell for this gotcha).
			System.out.println(i + " "+ j + " " + max);
		}

		in.close();
		out.close();
		System.exit(0);
	}
	// Calculates the cycle length for a given target, for the 3n+1 problem
	private static long cycleLength(long target){
		int length = 1;
		while(target != 1){
			// If the number is even, divide by two, else multiply by three and add 1.
			target = (target%2 == 0)? target/2: target*3 + 1;
			length++;
		}
		return length;
	}

}
