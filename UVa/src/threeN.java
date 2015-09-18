import java.util.*;
import java.io.*;

// UVa Online judge problem 100 - The 3n + 1 problem.
public class threeN {

	public static void main(String[] args) {
		// Initialize io objects
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		
		// Create a hasmap dictionary of cycle lengths for each number to limit amount of times the length is calculated.
		Map<Integer, Integer> cycleMap =  new HashMap<Integer, Integer>();
		
		// Run for as long as input is an integer
		while(in.hasNextInt()){
			int i = in.nextInt();
			int j = in.nextInt();
			int max = 0;
			
			//Determine start and end numbers
			int start = (i>j)?j:i;
			int finish = (i>j)?i:j;
			
			

			// for every number between i and j, first see if cycle length is in cycleMap, if so print that value
			// if not, calculate cycle length for the number.
			for (int target = start; target <= finish; target++){
				int cycleLength = -1;
				
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
			out.printf("%d %d %d\n",start,finish,max);

		}

		in.close();
		out.close();
		
	}
	// Calculates the cycle length for a given target, for the 3n+1 problem
	public static int cycleLength(int target){
		int length = 1;
		while(target != 1){
			// If the number is even, divide by two, else multiply by three and add 1.
			target = (target%2 == 0)? target/2: target*3 + 1;
			length++;
		}
		return length;
	}
	
}
