package com.euler;

public class Problem34 {

    private static long[] factorials = new long[10];

    /**
     * @param args
     */
    public static void main(String[] args) {
	factorials[0] = 1; // 0!=1
	for (int i = 1; i <= 9; i++) {
	    factorials[i] = getFactorial(i);
	}

	long result = 0;
	long sum = 0;
	for (long i = 10; i <= factorials[9] * 7; i++) {
	    sum = getFactorialSum(i);
	    if (sum == i) {
		result = result + i;
	    }
	}
	System.out.println(result);
    }

    private static long getFactorialSum(long i) {
	long sum = 0;
	while (i > 0) {
	    sum = sum + factorials[(int) (i % 10)];
	    i = i / 10;
	}
	return sum;
    }

    private static int getFactorial(int number) {
	int result = 1;
	for (int i = 1; i <= number; i++) {
	    result = result * i;
	}
	return result;
    }

}
