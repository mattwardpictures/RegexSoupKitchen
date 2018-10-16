package lab7package;

import java.util.Scanner;

public class RegexSoupMan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("==============================");
		System.out.println("______    WELCOME TO    ______");
		System.out.println("      REGEX SOUP KITCHEN      ");
		System.out.println("==============================");

		System.out.println(" ");
		System.out.println(Validator.getPatternMatchingRegex(scan, "Please state your name. ", "[A-Z][a-z]{2,30}"));
		System.out.println(" ");
		System.out.println("Next Question!");
		System.out.println(
				Validator.getPatternMatchingRegex(scan, "Please type your email. ", "\\w{5,30}@\\w{5,10}.\\w{2,3}"));
		System.out.println(" ");
		System.out.println(
				Validator.getPatternMatchingRegex(scan, "Please state your phone-number. ", "\\d{3}-\\d{3}-\\d{4}"));
		System.out.println(" ");
		System.out.println(Validator.getPatternMatchingRegex(scan, "Give the current date! ", "\\d{2}/\\d{2}/\\d{4}"));
		System.out.println(" ");
		System.out.println("Enjoy your soup!");

	}

}
