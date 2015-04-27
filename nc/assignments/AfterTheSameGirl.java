/*
 * QUESTION:
 * A few friends all fancy the same girl. They're not so smart,
 * so need help deciding who will pursue. With your help, they
 * decide to draw a quick bet to see who so ever discretely
 * provides the largest number to you would pursue their
 * chances with the girl. How would you help them using Java?
 */

package nc.assignments;

import java.util.Scanner;

import nc.reusable.LargestArrayIndex;
import nc.reusable.ShuffleArray;

public class AfterTheSameGirl {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.print("How many people are going to compete for the girl?: ");
		int noOfCompetitors = scanner.nextInt();
		String[] competitors = new String[noOfCompetitors];
		System.out.println("Provide names of all " + noOfCompetitors
				+ " competitors on separate lines");
		for (int i = 0; i < noOfCompetitors; i++) {
			System.out.print(i + 1 + ": ");
			competitors[i] = scanner.next();
		}
		ShuffleArray.shuffleArray(competitors);
		System.out
				.println("The program will randomly call competitors to provide their number.");
		// Java allows primitive array types!
		int[] numberProvided = new int[noOfCompetitors];
		for (int i = 0; i < noOfCompetitors; i++) {
			System.out.print(competitors[i]
					+ ", please provide your highest number: ");
			numberProvided[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.print("\n\nAnd the winner is...");
		String winner = competitors[LargestArrayIndex
				.largestArrayIndex(numberProvided)];
		System.out.println(winner.toUpperCase() + ". Go get the girl, "
				+ winner + "!");
		System.out.println();
	}
}
