package com.euler;


public class Problem24 {

    private static int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private static int N = 10;

    /**
     * @param args
     */
    public static void main(String[] args) {
	for (int index = 1; index < 1000000; index++) {
	    getNext();
	}
	for (int i = 0; i < 10; i++) {
	    System.out.print(a[i]);
	}
    }

    private static void getNext() {
	int k = N - 1;
	while (k > 1 && a[k] <= a[k - 1]) {
	    k--;
	}
	int l = N;
	while (l >= 0 && a[l - 1] < a[k - 1]) {
	    l--;
	}
	swap(k - 1, l - 1);
	reverse(k + 1, N);
    }

    private static void reverse(int start, int end) {
	while (start < end) {
	    swap(start - 1, end - 1);
	    start++;
	    end--;
	}
    }

    private static void swap(int k, int l) {
	int tmp = a[k];
	a[k] = a[l];
	a[l] = tmp;
    }

}
