/*
 * QUESTION: Mr. Thomas wants to compute the category of a student
 * based on their marks obtained in 5 subjects.
 * Please help him do this easily with Java.
 */

package learn.inputmethods;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Please provide marks for the following subjects as requested (out of 100 marks each):");
		System.out.print("Mathematics: ");
		int mathematics = scanner.nextInt();
		System.out.print("English: ");
		int english = scanner.nextInt();
		System.out.print("Hindi: ");
		int hindi = scanner.nextInt();
		System.out.print("Science: ");
		int science = scanner.nextInt();
		System.out.print("Social Science: ");
		int socialScience = scanner.nextInt();
		scanner.close();
		int percentage = (mathematics + english + hindi + science + socialScience) / 5;
		if (percentage >= 90) {
			System.out.println("Category: EXCELLENT");
		} else if (percentage >= 80) {
			System.out.println("Category: VERY GOOD");
		} else if (percentage >= 60) {
			System.out.println("Category: GOOD");
		} else if (percentage >= 40) {
			System.out.println("Category: AVERAGE");
		} else {
			System.out.println("Category: POOR");
		}
	}
}