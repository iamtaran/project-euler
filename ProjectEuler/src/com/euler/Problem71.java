package com.euler;

public class Problem71 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int d = 1000000;
	int numerator = 0;
	float largestFraction = 0;
	int result = 0;
	while (d > 1) {
	    if (((3 * d) / 7 == (float) (3 * d) / 7)) {
		numerator = (3 * d) / 7 - 1;
	    } else {
		numerator = (3 * d) / 7;
	    }
	    if ((float) numerator / d > largestFraction) {
		largestFraction = (float) numerator / d;
		result=numerator;
	    }
	    d--;
	}
	System.out.println(result);
    }

    private static int getGCD(int n1, int n2) {
	if (n2 == 0) {
	    return n1;
	}
	return getGCD(n2, n1 % n2);
    }

}
