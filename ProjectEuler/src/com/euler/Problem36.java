package com.euler;

public class Problem36 {

    public static void main(String[] args) {
	int count = 0;
	int i = 10;
	int[] allTruncatedNumbers = null;
	int result = 0;
	while (count != 11) {
	    allTruncatedNumbers = getAllTruncatedNumber(i);
	    if (areAllPrime(allTruncatedNumbers)) {
		count++;
		result = result + i;
	    }
	    i++;
	}
	System.out.println(result);
    }

    private static boolean areAllPrime(int[] allTruncatedNumbers) {
	for (int i = 0; i < allTruncatedNumbers.length; i++) {
	    if (!isPrime(allTruncatedNumbers[i])) {
		return false;
	    }
	}
	return true;
    }

    private static int[] getAllTruncatedNumber(int number) {
	int size = getNumberOfDigits(number);
	int[] allTruncatedNumbers = new int[2 * (size - 1) + 1];
	int[] leftTruncatedNumbers = getAllLeftTruncatedNumber(number);
	int[] rightTruncatedNumbers = getAllRightTruncatedNumber(number);
	for (int i = 0; i < 2 * (size - 1); i = i + 2) {
	    allTruncatedNumbers[i] = leftTruncatedNumbers[i / 2];
	    allTruncatedNumbers[i + 1] = rightTruncatedNumbers[i / 2];
	}
	allTruncatedNumbers[2 * (size - 1)] = number;
	return allTruncatedNumbers;
    }

    private static int[] getAllLeftTruncatedNumber(int number) {
	int size = getNumberOfDigits(number);
	int factor = 0;
	int[] leftTruncatedNumbers = new int[size - 1];
	int originalSize = size;
	for (int i = 0; i < originalSize - 1; i++) {
	    factor = (int) Math.pow(10, size - 1);
	    leftTruncatedNumbers[i] = number % factor;
	    number = number % factor;
	    size--;
	}
	return leftTruncatedNumbers;
    }

    private static int[] getAllRightTruncatedNumber(int number) {
	int size = getNumberOfDigits(number);
	int factor = 0;
	int[] rightTruncatedNumbers = new int[size - 1];
	for (int i = 0; i < size - 1; i++) {
	    rightTruncatedNumbers[i] = number / 10;
	    number = number / 10;
	}
	return rightTruncatedNumbers;
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
