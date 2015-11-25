package com.euler;

import java.math.BigInteger;

public class Problem57 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	BigInteger[] numerators = new BigInteger[1000];
	BigInteger[] denominators = new BigInteger[1000];
	long result = 0;
	BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);
	numerators[0] = BigInteger.valueOf(3);
	denominators[0] = BigInteger.valueOf(2);
	for (int i = 1; i < 1000; i++) {
	    numerators[i] = denominators[i - 1].multiply(TWO).add(numerators[i - 1]);
	    denominators[i] = denominators[i - 1].add(numerators[i - 1]);
	    if (getNumberOfDigits(numerators[i]) > getNumberOfDigits(denominators[i])) {
		result++;
	    }
	}
	System.out.println(result);
    }

    private static long getNumberOfDigits(BigInteger number) {
	long count = 0;
	while (number.compareTo(BigInteger.ZERO) == 1) {
	    count++;
	    number = number.divide(BigInteger.TEN);
	}
	return count;
    }

}
