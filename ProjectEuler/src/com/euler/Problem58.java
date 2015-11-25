package com.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem58 {
    private static List<Integer> diagonals = new ArrayList<Integer>();
    private static int index;
    private static float primeCount=0;

    /**
     * @param args
     */
    public static void main(String[] args) {
	init();
	int spiralLength = 3;
	float percentage = 100;
	while (percentage > 10) {
	    addNextDiagonalElement();
	    addNextDiagonalElement();
	    addNextDiagonalElement();
	    addNextDiagonalElement();
	    percentage = primePercentage();
	    System.out.println(percentage);
	    spiralLength = spiralLength + 2;
	}
	System.out.println(spiralLength);
    }     

    private static float primePercentage() {
	float percentage = 0;
	float total = diagonals.size();
	for(int i=index-3;i<=index;i++){
	    if (isPrime(diagonals.get(i))) {
		primeCount++;
	    }
	}
	percentage = (primeCount / total) * 100;
	return percentage;
    }

    private static void addNextDiagonalElement() {
	index++;
	int nextElement;
	if (index >= 8) {
	    nextElement = 2 * diagonals.get(index - 4)
		    - diagonals.get(index - 8) + 8;
	} else {
	    nextElement = 2 * diagonals.get(index - 4) - 1 + 8;
	}
	diagonals.add(nextElement);
    }

    private static void init() {
	diagonals.add(1);
	diagonals.add(3);
	diagonals.add(5);
	diagonals.add(7);
	diagonals.add(9);
	index = 4;
	primeCount=3;
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
