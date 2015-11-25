package com.euler;

import java.util.HashMap;
import java.util.Map;

public class Problem21 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int result = 0;
	for (int number = 1; number < 10000; number++) {
	    if(isAmicable(number)){
		result = result + number;
	    }
	}
	System.out.println("Result = " + result);
    }

    private static boolean isAmicable(int number) {
	int sumProper = getSumProper(number);
	return sumProper!=number && getSumProper(sumProper)==number;
    }

    private static int getSumProper(int number) {
	int sum = 0;
	for (int index = 1; index <= number / 2; index++) {
	    if (number % index == 0) {
		sum = sum + index;
	    }
	}
	return sum;
    }
}
