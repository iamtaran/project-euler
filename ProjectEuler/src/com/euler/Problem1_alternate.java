/**
 * 
 */
package com.euler;

/**
 * @author iamtaran
 * 
 */
public class Problem1_alternate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		/* start */
		long n=Integer.MAX_VALUE;
		long sum = 0;
		for (long i = 3; i < n; i = i + 3) {
			sum = sum + i;
		}
		for (long i = 5; i < n; i = i + 5) {
			sum = sum + i;
		}
		for (long i = 15; i < n; i = i + 15) {
			sum = sum - i;
		}
		System.out.println("result = " + sum);
		/* end */

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime + " milliseconds");
	}

}
