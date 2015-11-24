/**
 * 
 */
package com.euler;

/**
 * @author Taran Pawa
 * 
 */
public class Problem5_alternate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		/* start */
		int result = 1;
		long n[] = new long[20];
		for (int i = 0; i < 20; i++) {
			n[i] = i + 1;
		}		
		System.out.println("result = " + lcm(n));
		/* end */

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime + " milliseconds");
	}

	private static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

	private static long lcm(long[] input) {
		long result = input[0];
		for (int i = 1; i < input.length; i++)
			result = lcm(result, input[i]);
		return result;
	}

	private static long gcd(long a, long b) {
		while (b > 0) {
			long temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		return a;
	}

}
