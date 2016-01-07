package com.not.euler;

import java.util.HashSet;
import java.util.Set;

/**
 * Find The First and last Non Repeated Character In A String. If the word "stress" is
 * input then it should print 't' as output. If the word "teeter" is input then
 * it should print 'r' as output .
 * 
 * @author iamtaran
 * 
 */
public class NonRepeatingLetter {

	public static void main(String args[]) {
		String input = "stress";
		String answer1 = last(input);
		System.out.println(answer1);

		char answer2 = first(input);
		System.out.println(answer2);
	}

	private static String last(String input) {
		Set<String> a = new HashSet<String>();
		String answer = "";
		for (int i = 0; i < input.length(); i++) {
			String current = input.substring(i, i + 1);
			if (!a.contains(current)) {
				answer = current;
				a.add(current);
			}
		}
		return answer;
	}

	private static char first(String input) {
		char answer = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(input.indexOf(ch)==input.lastIndexOf(ch)){
				answer= ch;
				break;
			}
		}
		return answer;
	}

}
