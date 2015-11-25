package com.euler;

public class Problem72 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int limit = 1000000;
	int[] phi = createIndexArray(limit);
	long result=0;
	for(int i=2;i<=limit;i++){
	    if(phi[i]==i){
		for(int j=i;j<=limit;j=j+i){
		    phi[j]=phi[j]/i*(i-1);
		}
	    }
	    result=result+phi[i];
	}
	System.out.println(result);
    }

    private static int[] createIndexArray(int limit) {
	int[] numbers = new int[limit + 1];
	for (int i = 1; i <= limit; i++) {
	    numbers[i] = i;
	}
	return numbers;
    }

}
