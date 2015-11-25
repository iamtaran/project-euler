package com.euler;

/**
 * 
 * @author iamtaran
 *
 */
public class Problem10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long sum = 0;
		for (long i = 2; i < 2000000; i++) {
			if (isPrime(i)) {
				sum = sum + i;
			}
		}
		System.out.println("Result = " + sum);
	}

	private static boolean isPrime(long number) {
		if (number != 2 && number % 2 == 0) {
			return false;
		}
		for (long i = 3; i <= Math.floor(Math.sqrt(number)) + 1; i = i + 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
