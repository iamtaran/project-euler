package com.euler;

/**
 * 
 * @author Taran Pawa
 *
 */
public class Problem1 {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		/* start */
		long sum = 0;
		for (long i = 1; i < Integer.MAX_VALUE; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("result = " + sum);
		/* end */

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime+" milliseconds");
	}

}
