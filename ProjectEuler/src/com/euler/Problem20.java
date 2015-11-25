package com.euler;

import java.math.BigInteger;

public class Problem20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger number = BigInteger.ONE;
		for (int index = 1; index <= 100; index++) {
			number = number.multiply(BigInteger.valueOf(index));
		}
		BigInteger sum = BigInteger.ZERO;
		while (number.compareTo(BigInteger.ZERO) == 1) {
			sum = sum.add(number.mod(BigInteger.TEN));
			number = number.divide(BigInteger.TEN);
		}
		System.out.println("Sum = "+sum);
	}
}
