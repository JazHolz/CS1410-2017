package Lab;

import java.util.Scanner;

public class LabRegex {
	public static void main(String[] args) {
		String myRegex = "CS\\d{4}";
		String myRegex1 = "A.*";
		String myRegex2 ="[AEIOU].*";
		String myRegex3 = "[AEIOU].+";
		String myRegex4 = "\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d";
		String myRegex5 = "[a-zA-Z0-9_\\.\\+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-\\.]+";
		test(myRegex);
		test(myRegex1);
		test(myRegex2);
		test(myRegex3);
		test(myRegex4);
		test(myRegex5);
	}

	private static void test(String regex) {
		String word;
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter words to match the expression %s%n", regex);
		System.out.println("Enter DONE when you are finished");
		System.out.print("Word: ");
		word = input.nextLine();
		while (!word.equalsIgnoreCase("done")) {
			System.out.printf("%s %s%n", word, word.matches(regex) ? "matches" : "does not match");
			System.out.print("Word: ");
			word = input.nextLine();
		}
	}
}