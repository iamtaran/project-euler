/**
 * 
 */
package com.euler;

/**
 * @author Taran Pawa
 * 
 */
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		/* start */
		int result = 20;
		while (!isDivisible(result)) {
			result++;
		}
		System.out.println("result = " + result);
		/* end */

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime + " milliseconds");
	}

	private static boolean isDivisible(int number) {
		boolean isDivisible = true;
		for (int i = 1; i <= 20; i++) {
			if (number % i != 0) {
				isDivisible = false;
				break;
			}
		}
		return isDivisible;
	}

}
