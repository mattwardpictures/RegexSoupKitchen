package lab7package;

import java.util.Scanner;

public class Validator {
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static String getPatternMatchingRegex(Scanner scan, String prompt, String regex) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scan, prompt);
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println(" ");
				System.out.println("No Soup For You!.");
				isValid = false;
			}
		} while (!isValid);

		return input + " is valid.";

	}
}