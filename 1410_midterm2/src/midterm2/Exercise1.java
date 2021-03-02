package midterm2;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {

		// Part A
		List<Character> list = new ArrayList<Character>();

		list.add('a');
		list.add('@');
		list.add('b');
		list.add('c');
		list.add('#');
		list.add('$');

		String output = "list: [";
		for (int i = 0; i < list.size(); i++) {
			output += list.get(i);

			if (i != list.size() - 1) {
				output += ", ";
			}
		}
		output += "]";
		System.out.println(output);

		// Part B
		Character item = '&';

		if (list.contains(item)) {
			System.out.println("The element & is a part of the list");

		} else {

			System.out.println("The element & is not part of the list");
		}

		Character secondElement = list.get(1);
		Character lastElement = list.get(list.size() - 1);
		list.remove(1);
		list.add(1, lastElement);
		list.remove(list.size() - 1);
		list.add(secondElement);

		String newOutput = "list: [";
		for (int i = 0; i < list.size(); i++) {
			newOutput += list.get(i);

			if (i != list.size() - 1) {
				newOutput += ", ";
			}
		}
		newOutput += "]";
		System.out.println(newOutput);

		// Part C
		String pattern = "\\w";

		for (Character c : list) {
			String str = c + "";

			System.out.print(str.matches(pattern) + " ");
		}

	}
}
