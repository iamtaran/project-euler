package com.not.euler;

import java.util.HashSet;
import java.util.Set;

/**
 * Find The First Non Repeated Character In A String. If the word "stress" is
 * input then it should print 't' as output. If the word "teeter" is input then
 * it should print 'r' as output .
 * 
 * @author iamtaran
 * 
 */
public class NonRepeatingLetter {

	public static void main(String args[]) {
		String input ="teeter";
		Set<String> a = new HashSet<String>();
		String answer = "";
		for(int i=0;i<input.length();i++){
			String current=input.substring(i,i+1);
			if(!a.contains(current)){
				answer=current;
				a.add(current);
			}
		}
		System.out.println(answer);
	}
	
}
