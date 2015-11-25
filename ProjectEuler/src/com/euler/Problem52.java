package com.euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Problem52 {
    public static void main(String[] args) {
	int i = 1;
	int twoTimes = 0;
	int thrice = 0;
	int quadraple = 0;
	int quintuple = 0;
	int sixTimes = 0;
	Set<Integer> oneList = null;
	Set<Integer> twoList = null;
	Set<Integer> threeList = null;
	Set<Integer> fourList = null;
	Set<Integer> fiveList = null;
	Set<Integer> sixList = null;
	while (true) {
	    oneList = getDigits(i);

	    twoTimes = i << 1;
	    twoList = getDigits(twoTimes);

	    if (oneList.equals(twoList)) {
		thrice = 3 * i;
		threeList = getDigits(thrice);
		if (oneList.equals(threeList)) {
		    quadraple = i << 2;
		    fourList = getDigits(quadraple);
		    if (oneList.equals(fourList)) {
			quintuple = 5 * i;
			fiveList = getDigits(quintuple);
			if (oneList.equals(fiveList)) {
			    sixTimes = 6 * i;
			    sixList = getDigits(sixTimes);
			    if (oneList.equals(sixList)) {
				break;
			    }
			}
		    }
		}
	    }
	    i++;
	}
	System.out.println(i);
    }

    private static Set<Integer> getDigits(int number) {
	Set<Integer> numbers = new HashSet<Integer>();
	while (number > 0) {
	    numbers.add(number % 10);
	    number = number / 10;
	}
	return numbers;
    }
}
