package com.euler;

import java.math.BigInteger;

public class Problem65 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	BigInteger t = BigInteger.ONE;
	BigInteger d = BigInteger.ONE.add(BigInteger.ONE);
	BigInteger n = BigInteger.ZERO;
	int mulFactor = 0;
	for (int i = 2; i <= 100; i++) {
	    mulFactor = (i % 3 == 0) ? (2 * i / 3) : 1;
	    n = d.multiply(BigInteger.valueOf(mulFactor)).add(t);
	    BigInteger tmp = d;
	    d = n;
	    t = tmp;
	}
	System.out.println(getSumOfDigits(n));

    }

    private static String getSumOfDigits(BigInteger number) {
	BigInteger sum=BigInteger.ZERO;
	while(number.compareTo(BigInteger.ZERO)==1){
	    sum=sum.add(number.mod(BigInteger.TEN));
	    number=number.divide(BigInteger.TEN);
	}
	return sum.toString();
    }

}
