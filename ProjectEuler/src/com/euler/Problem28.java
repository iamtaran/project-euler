package com.euler;

public class Problem28 {

	public static void main(String[] args) {
		int sum = 101;
		int currentDifference = 76;
		int previousDifference = 24;
		int newSum = 0;
		for (int i = 7; i <= 1001; i = i + 2) {
			newSum = sum + 2 * currentDifference - previousDifference + 32;
			previousDifference = currentDifference;
			currentDifference = newSum - sum;
			sum = newSum;
		}
		System.out.println(sum);
	}
}
