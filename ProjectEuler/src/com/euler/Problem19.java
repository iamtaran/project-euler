package com.euler;

public class Problem19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		int daysCount = 0;
		int nextFirstDay = 0;
		int currentFirstDay = 1;
		int sundayCount = 0;
		for (int year = 1900; year <= 2000; year++) {
			for (int month = 1; month <= 12; month++) {
				daysCount = getDays(month, year);
				nextFirstDay = getNextFirstDay(currentFirstDay, daysCount);
				if (nextFirstDay == 0 && year != 1900) {
					sundayCount++;
				}
				currentFirstDay = nextFirstDay;
			}
		}
		System.out.println("Result = " + sundayCount);
		long end = System.currentTimeMillis();
		System.out.println((end-begin)+" ms time taken");
	}

	private static boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		if ((year & 3) == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				}
			} else {
				isLeapYear = true;
			}
		}
		return isLeapYear;
	}

	private static int getDays(int month, int year) {
		int days = 0;
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			if (isLeapYear(year)) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		default:
			break;
		}
		return days;
	}

	private static int getNextFirstDay(int currentFirstDay, int daysCount) {
		return (daysCount % 7 + currentFirstDay) % 7;
	}
}
