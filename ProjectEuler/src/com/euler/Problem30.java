package com.euler;

public class Problem30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		int number;
		int resultSum = 0;
		for (int i = 2; i <= 354294; i++) {
			number = i;
			while (number > 0) {
				sum = (int) (sum + Math.pow(number % 10, 5));
				number = number / 10;
			}
			if (sum == i) {
				resultSum = resultSum + i;
			}
			sum = 0;
		}
		System.out.println(resultSum);
	}

}
