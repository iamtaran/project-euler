package com.euler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem29 {

	private static int N = 100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int distinctTerms = 0;
		for (int a = 2; a <= N; a++) {
			System.out.println(a+" - "+getDistinctTerms(a));
			distinctTerms = distinctTerms + getDistinctTerms(a);
		}
		System.out.println(distinctTerms);

		Set<BigDecimal> mul = new HashSet<BigDecimal>();
		for (int a = 2; a <= N; a++) {
			for (int b = 2; b <= N; b++) {
				mul.add(BigDecimal.valueOf(Math.pow(a, b)));
			}
		}
		System.out.println(mul.size());
	}

	private static int get(int number) {
		for (int i = (int) Math.sqrt(number); i > 1; i--) {
			if (isWholeNumber(Math.log(number) / Math.log(i))) {
				return (int) (Math.log(number) / Math.log(i));
			}
		}
		return 1;
	}

	private static boolean isWholeNumber(double number) {
		int intValue = (int) number;
		return number == intValue;
	}

	private static int getDistinctTerms(int number) {
		int range = get(number);
		if (range == 1) {
			return N - 1;
		} else {
			return (N - N / get(number));
		}
	}

}
