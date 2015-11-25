package com.euler;

public class Problem45 {

	//triangular is subset of hexagonal
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n = 144;
		long hexagonal = 0;
		while (true) {
			hexagonal = n * (2 * n - 1);
			if (isPentagonal(hexagonal)) {
				break;
			}
			n++;
		}
		System.out.println(hexagonal);
	}

	private static boolean isPentagonal(long number) {
		double doubleValue = (Math.sqrt(24 * number + 1) + 1) / 6;
		long longValue = (long) doubleValue;
		return doubleValue == longValue;
	}

	private static boolean isHexagonal(long number) {
		double doubleValue = (Math.sqrt(8 * number + 1) + 1) / 4;
		long longValue = (long) doubleValue;
		return doubleValue == longValue;
	}

}
