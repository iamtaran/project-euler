package com.euler;

public class Problem35 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int count = 0;
	int[] circularNumber;
	for (int number = 2; number < 1000000; number++) {
	    circularNumber = getAllCircularNumbers(number);
	    if (isCircularPrime(circularNumber)) {
		count++;
	    }
	}
	System.out.println(count);
    }

    private static boolean isCircularPrime(int[] circularNumber) {
	for (int i = 0; i < circularNumber.length; i++) {
	    if (!isPrime(circularNumber[i])) {
		return false;
	    }
	}
	return true;
    }

    private static int[] getAllCircularNumbers(int number) {
	int size = getNumberOfDigits(number);
	int divisor = (int) Math.pow(10, size - 1);
	int[] circularNumbers = new int[size];
	for (int i = 0; i <= size - 1; i++) {
	    circularNumbers[i] = (number % 10) * divisor + number / 10;
	    number = circularNumbers[i];

	}
	return circularNumbers;
    }

    private static int getNumberOfDigits(int number) {
	int count = 0;
	while (number > 0) {
	    count++;
	    number = number / 10;
	}
	return count;
    }

    private static boolean isPrime(int number) {
	boolean isPrime = true;
	if (number == 1) {
	    isPrime = false;
	} else if (number != 2 && (number & 1) == 0) {
	    isPrime = false;
	} else {
	    for (int i = 3; i <= Math.sqrt(number); i = i + 2) {
		if (number % i == 0) {
		    isPrime = false;
		    break;
		}
	    }
	}
	return isPrime;
    }
}
