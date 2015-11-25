package com.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem50 {
    public static void main(String[] args) {
	int prime = 0;
	int sum = 0;
	int result = 0;
	List<Integer> sums = new ArrayList<Integer>();
	int index = 0;
	while (sum < 1000000) {
	    sums.add(sum);
	    prime = getNextPrime(prime);
	    sum = sum + prime;
	}

	for (int i = 0; i < sums.size(); i++) {
	    for (int j = i + 1; j < sums.size(); j++) {
		if (sums.get(j) - sums.get(i) > result
			&& isPrime(sums.get(j) - sums.get(i))) {
		    result = sums.get(j) - sums.get(i);
		}
	    }
	}

	System.out.println(result);
    }

    private static int getNextPrime(int prime) {
	if (prime == 0 || prime == 1) {
	    prime = 2;
	} else {
	    boolean isPrime = false;
	    while (!isPrime) {
		prime++;
		isPrime = isPrime(prime);
	    }
	}
	return prime;
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
