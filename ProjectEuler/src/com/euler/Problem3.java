package com.euler;

public class Problem3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	long input = 600851475143L;
	long factor = 2;
	long ans = 0;
	while (factor <= input) {
	    long rem = input % factor;
	    if (rem == 0) {
		ans = factor;
		input = input / factor;
		factor = 2;
	    } else {
		if (factor % 2 == 0) {
		    factor++;
		} else {
		    factor = factor + 2;
		}
	    }
	}
	System.out.println("Answer = " + ans);
	System.exit(0);
    }

}
