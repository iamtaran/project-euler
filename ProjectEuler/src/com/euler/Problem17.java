package com.euler;

public class Problem17 {

    private static String one = "one";
    private static String two = "two";
    private static String three = "three";
    private static String four = "four";
    private static String five = "five";
    private static String six = "six";
    private static String seven = "seven";
    private static String eight = "eight";
    private static String nine = "nine";
    private static String ten = "ten";
    private static String eleven = "eleven";
    private static String twelve = "twelve";
    private static String thirteen = "thirteen";
    private static String fourteen = "fourteen";
    private static String fifteen = "fifteen";
    private static String sixteen = "sixteen";
    private static String seventeen = "seventeen";
    private static String eighteen = "eighteen";
    private static String nineteen = "nineteen";
    private static String twenty = "twenty";
    private static String thirty = "thirty";
    private static String forty = "forty";
    private static String fifty = "fifty";
    private static String sixty = "sixty";
    private static String seventy = "seventy";
    private static String eighty = "eighty";
    private static String ninety = "ninety";
    private static String hundred = "hundred";
    private static String thousand = "thousand";

    /**
     * @param args
     */
    public static void main(String[] args) {
	long begin = System.currentTimeMillis();
	int sum = 0;
	for (int number = 1; number <= 1000; number++) {
	    sum = sum + convertToWord(number).length();
	}
	System.out.println("Sum = " + sum);
	long end = System.currentTimeMillis();
	System.out.println("Time taken:: " + (end - begin) + " ms");
    }

    private static String convertToWord(int number) {
	String word = null;
	if (number < 21) {
	    word = getWord(number);
	} else if (number < 100) {
	    int tenthDigit = number / 10 * 10;
	    int unitDigit = number % 10;
	    word = getWord(tenthDigit);
	    if (unitDigit != 0) {
		word = word + "" + convertToWord(unitDigit);
	    }
	} else if (number < 1000) {
	    int hundrethDigit = number / 100;
	    int restDigit = number % 100;
	    word = convertToWord(hundrethDigit)+"hundred";
	    if (restDigit != 0) {
		word = word + "and"+convertToWord(restDigit);
	    }
	} else {
	    int thousandthDigit = number / 1000;
	    int restDigit = number % 1000;
	    word = convertToWord(thousandthDigit)+"thousand";
	    if (restDigit != 0) {
		word = word + "and"+convertToWord(restDigit);
	    }
	}
	return word;
    }

    private static String getWord(int number) {
	String word = null;
	switch (number) {
	case 1:
	    word = one;
	    break;
	case 2:
	    word = two;
	    break;
	case 3:
	    word = three;
	    break;
	case 4:
	    word = four;
	    break;
	case 5:
	    word = five;
	    break;
	case 6:
	    word = six;
	    break;
	case 7:
	    word = seven;
	    break;
	case 8:
	    word = eight;
	    break;
	case 9:
	    word = nine;
	    break;
	case 10:
	    word = ten;
	    break;
	case 11:
	    word = eleven;
	    break;
	case 12:
	    word = twelve;
	    break;
	case 13:
	    word = thirteen;
	    break;
	case 14:
	    word = fourteen;
	    break;
	case 15:
	    word = fifteen;
	    break;
	case 16:
	    word = sixteen;
	    break;
	case 17:
	    word = seventeen;
	    break;
	case 18:
	    word = eighteen;
	    break;
	case 19:
	    word = nineteen;
	    break;
	case 20:
	    word = twenty;
	    break;
	case 30:
	    word = thirty;
	    break;
	case 40:
	    word = forty;
	    break;
	case 50:
	    word = fifty;
	    break;
	case 60:
	    word = sixty;
	    break;
	case 70:
	    word = seventy;
	    break;
	case 80:
	    word = eighty;
	    break;
	case 90:
	    word = ninety;
	    break;
	default:
	    break;
	}

	return word;
    }

}
