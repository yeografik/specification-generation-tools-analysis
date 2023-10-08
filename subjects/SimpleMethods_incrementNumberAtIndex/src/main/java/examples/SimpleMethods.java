package examples;

import java.util.Arrays;

public class SimpleMethods {

	/** Increment the value of element in a non-null array at a given index
	 * @param intArray array of integers
	 * @param ind index at which the element will be incremented
	 */
	public void incrementNumberAtIndex(int[] intArray, int ind) {

		// instrumentation
		int old_value = intArray[ind];

		// actual method
		intArray[ind] = intArray[ind] + 1;
		
	}
}

