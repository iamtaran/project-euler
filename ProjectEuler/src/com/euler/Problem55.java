package com.euler;

import java.math.BigInteger;

public class Problem55 {

    public static void main(String[] args) {
	int result = 0;
	for (long number = 1; number < 10000; number++) {
	    if (IsLychrel(number)) {
		System.out.println(number);
		result++;
	    }
	}
	System.out.println(result);
    }

    private static BigInteger getReverse(BigInteger number) {
	BigInteger reverse = BigInteger.ZERO;
	while (number.compareTo(BigInteger.ZERO) == 1) {
	    reverse = reverse.multiply(BigInteger.TEN).add(
		    number.mod(BigInteger.TEN));
	    number = number.divide(BigInteger.TEN);
	}
	return reverse;
    }

    private static boolean isPalindrome(BigInteger number) {
	return number.equals(getReverse(number));
    }

    private static boolean IsLychrel(long number) {
	BigInteger numberToCheck = BigInteger.valueOf(number);
	for (int iteration = 0; iteration < 50; iteration++) {
	    numberToCheck = numberToCheck.add(getReverse(numberToCheck));
	    if (isPalindrome(numberToCheck)) {
		return false;
	    }
	}
	return true;
    }
}
