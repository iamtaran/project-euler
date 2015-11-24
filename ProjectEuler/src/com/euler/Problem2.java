package com.euler;

public class Problem2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int first=1;
	int second=2;
	int sum=second;
	int next=0;
	while(next<=4000000){
	    next=first+second;
	    if(next%2==0){
		sum=sum+next;
	    }
	    first=second;
	    second=next;	    
	}
	System.out.println("Result="+sum);

    }

}
