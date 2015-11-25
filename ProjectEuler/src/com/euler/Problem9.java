package com.euler;

public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int first = 1;; first++) {
			for (int second = 1; second < first; second++) {
				for (int third = 1; third < second; third++) {
					if (first + second + third == 1000) {
						if (first * first == second * second + third * third) {
							System.out.println("Result="+first*second*third);
							System.exit(0);
						}
					}
				}
			}
		}

	}

}
