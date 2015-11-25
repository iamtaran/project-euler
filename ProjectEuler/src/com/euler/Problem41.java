package com.euler;

public class Problem41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = 0;
		for (int number = 7654321; number > 1000000; number--) {
			if (isPanDigital(number) && isPrime(number)) {
				result = number;
				break;
			}
		}
		System.out.println(result);
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

	private static boolean isPanDigital(int number) {
		boolean isPanDigital = true;
		int size = getNumberOfDigits(number);
		int[] numberContained = new int[10];
		int currentDigit = 0;
		while (number > 0) {
			currentDigit = number % 10;
			numberContained[currentDigit]++;
			number = number / 10;
		}
		for (int i = 0; i < 10; i++) {
			if ((i > 0 && i <= size && numberContained[i] == 1)
					|| ((i == 0 || i > size) && numberContained[i] == 0)) {
				isPanDigital = true;
			} else {
				isPanDigital = false;
				break;
			}
		}
		return isPanDigital;
	}

	private static int getNumberOfDigits(int number) {
		int count = 0;
		while (number > 0) {
			count++;
			number = number / 10;
		}
		return count;
	}

}
