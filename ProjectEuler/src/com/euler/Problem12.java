package com.euler;

public class Problem12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		System.out.println();
		int countDivisors = 0;
		int number = 0;
		int length = 1;
		while (countDivisors <= 500) {
			countDivisors = 0;
			number = 0;
			for (int i = 1; i < length; i++) {
				number = number + i;
			}
			for (int i = 1; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					countDivisors = countDivisors + 2;
				}
			}
			length++;
		}
		System.out.println("Result = " + number);
		long end = System.currentTimeMillis();
		System.out.println("Time taken = "+(end-begin)+" ms");
	}

}
