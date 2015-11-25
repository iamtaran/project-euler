package com.euler;

public class Problem4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
	int result=0;
	for (int firstNumer = 999; firstNumer > 0; firstNumer--) {
	    for (int secondNumber = 999; secondNumber > 0; secondNumber--) {
		int product = firstNumer*secondNumber;
		if(product>result&&isPalindrome(product)){
		    result = product;
		}
	    }
	}
	System.out.println("Largest palindrome number = "+result);
    }

    private static boolean isPalindrome(int number) {
	int originlNumber = number;
	boolean isPalindrome = false;
	int reverseNumber = 0;
	while (number > 0) {
	    reverseNumber = reverseNumber * 10 + number % 10;
	    number = number / 10;
	}
	if (originlNumber == reverseNumber) {
	    isPalindrome = true;
	}
	return isPalindrome;
    }
}
