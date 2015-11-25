package com.euler;

public class Problem14 {

    private static long[] length = new long[1000000];

    /**
     * @param args
     */
    public static void main(String[] args) {
	long begin = System.currentTimeMillis();
	long longestLength = 0;
	long result = 0;
	for (long i = 1; i < 1000000; i++) {
	    long length = getCollatzSeriesLength(i);
	    if (length > longestLength) {
		longestLength = length;
		result = i;
	    }
	}
	System.out.println("Result = " + result + " - " + longestLength);
	long end = System.currentTimeMillis();
	System.out.println("Time taken:: " + (end - begin) + " ms");
    }

    private static long getCollatzSeriesLength(long number) {
	long originalNumber = number;
	long counter = 1;
     
	while (number > 1) {
	    number = ((number & 1) == 1) ? (3 * number + 1) : (number >> 1);
	    //number = (number % 2 == 1) ? (3 * number + 1) : (number / 2);
	    counter++;
	}
	length[(int) originalNumber] = counter;
	return counter;
    }

}
