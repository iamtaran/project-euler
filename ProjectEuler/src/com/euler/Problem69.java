package com.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem69 {

    private static List<Integer> primes;

    /**
     * @param args
     */
    public static void main(String[] args) {
	int limit = 1000000;
	int result = 1;
	int prime = 1;
	while (result * prime < limit) {
	    prime = getNextPrime(prime);
	    result = result * prime;
	}
	System.out.println(result);
    }

    private static int getNextPrime(int lastPrime) {
	boolean found = false;
	while (!found) {
	    lastPrime++;
	    found = isPrime(lastPrime);
	}
	return lastPrime;
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
