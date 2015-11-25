package com.euler;

import java.math.BigInteger;

public class Problem53 {

    private static BigInteger[] factorials = new BigInteger[101];

    /**
     * @param args
     */
    public static void main(String[] args) {
	int result = 0;
	BigInteger combinationValue = BigInteger.ZERO;
	for (int n = 23; n <= 100; n++) {
	    for (int r = 0; r <= n; r++) {
		combinationValue = getCombinationValue(n, r);
		if (combinationValue.compareTo(BigInteger.valueOf(1000000)) == 1) {
		    result = result + (n + 1 - 2 * (r));
		    break;
		}
	    }
	}
	System.out.println(result);
    }

    private static BigInteger getFactorial(int number) {
	BigInteger result = BigInteger.ONE;
	if (factorials[number]==null) {
	    for (int i = 1; i <= number; i++) {
		result = result.multiply(BigInteger.valueOf(i));
	    }
	    factorials[number] = result;
	} else {
	    result = factorials[number];
	}
	return result;
    }

    private static BigInteger getCombinationValue(int n, int r) {
	BigInteger numerator = getFactorial(n);
	BigInteger denominator = getFactorial(n - r).multiply(getFactorial(r));
	return numerator.divide(denominator);
    }

}
