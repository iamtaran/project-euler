package com.euler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author iamtaran
 *
 */
public class Problem67 {

	public static void main(String[] args) throws IOException {

		int triangle[][] = new int[100][];

		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\iamtaran\\Desktop\\p067_triangle.txt"));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			int i = 1;
			int k = 0;
			while (line != null) {
				sb.append(line);
				triangle[k] = new int[i];
				int l = 0;
				for (int j = 0; j < i * 2 + i - 1; j = j + 3) {
					int number = Integer.parseInt(line.substring(j, j + 1))
							* 10
							+ Integer.parseInt(line.substring(j + 1, j + 2));
					triangle[k][l] = number;
					l++;
				}
				sb.append(System.lineSeparator());
				line = br.readLine();
				i++;
				k++;
			}
		} finally {
			br.close();
		}
		long startTime = System.currentTimeMillis();
		for (int i = 98; i >= 0; i--) {
			int length = triangle[i].length;
			for (int j = 0; j < length; j++) {
				int larger = triangle[i + 1][j] > triangle[i + 1][j + 1] ? triangle[i + 1][j]
						: triangle[i + 1][j + 1];
				triangle[i][j] = triangle[i][j] + larger;
			}
		}
		System.out.println(triangle[0][0]);
		 long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println(totalTime + " milliseconds");
		 
	}

}
