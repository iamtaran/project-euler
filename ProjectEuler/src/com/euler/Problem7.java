package com.euler;

public class Problem7 {

	public static void main(String args[]) {
		int index = 1;
		double number = 1;
		while (index<=10001) {
			number++;
			if (isPrime(number)) {
				index++;
			}
		}
		System.out.println("Result = " + number);
	}

	private static boolean isPrime(double number) {
		if (number != 2 && number % 2 == 0) {
			return false;
		}
		for (double i = 3; i <= Math.floor(Math.sqrt(number))+1; i = i + 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
