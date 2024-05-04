package algoritmos;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String args[]) {
		int initialRange = 0;
		int finalRange = 1000;
		
		System.out.print("Pick a number between 1 and 1000\n\n");

		int middle = userInteraction(initialRange, finalRange);

		System.out.println("Congratulations! The number you picked is " + middle + "!!");
	}

	private static int userInteraction(int initialRange, int finalRange) {
		int middle = findMiddle(initialRange, finalRange);

		try (Scanner scanner = new Scanner(System.in)) {
			showAnswerOptions(middle);

			String userInput = scanner.next();

			switch (userInput) {
			case "1": {
				return middle;
			}
			case "2": {
				finalRange = middle;
				return userInteraction(initialRange, finalRange);
			}
			case "3": {
				initialRange = middle;
				return userInteraction(initialRange, finalRange);
			}
			default:
				throw new IllegalArgumentException("Invalid input: " + userInput);
			}
		}
	}

	private static void showAnswerOptions(int middle) {
		System.out.print("Select an option below: \n\n");
		System.out.print("1 - My number is " + middle + "\n");
		System.out.print("2 - My number is less than " + middle + "\n");
		System.out.print("3 - My number is greater than " + middle + "\n\n");
	}

	private static int findMiddle(int initialRange, int finalRange) {
		return initialRange + ((finalRange - initialRange) / 2);
	}

}
