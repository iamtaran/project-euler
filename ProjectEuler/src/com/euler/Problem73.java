package com.euler;

public class Problem73 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int n = 12000;
	int a = 1;
	int b = 3;
	int c = 4000;
	int d = 11999;
	int e = 0;
	int f = 0;
	int count=0;
	while (!(c == 1 && d == 2)) {
	    e = ((n + b) / d) * c - a;
	    f = ((n + b) / d) * d - b;
	    a=c;
	    b=d;
	    c=e;
	    d=f;
	    count++;
	}
	System.out.println(count);
    }
}
