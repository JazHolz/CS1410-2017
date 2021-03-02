//Jazmine Mehri Lavasani
//CS1410 Final Project

package final1410;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Exercise2<T> {

	public static List<Double> duplicateElements(List<Double> elements) {
		List<Double> duplicated = new ArrayList<Double>();
		for (Double element : elements) {
			duplicated.add(element);
			duplicated.add(element);
		}
		return duplicated;
	}

	public static void main(String[] args) {
		List<Double> numbers = new ArrayList<Double>();

		File f = new File("src/final1410/MyFile.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String line = reader.readLine();
			while (line != null) {
				double nextNum = Double.parseDouble(line);

				numbers.add(nextNum);
				line = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		printList("list\t   : ", numbers);
		printList("double list: ", duplicateElements(numbers));
	}

	public static void printList(String prepend, List<Double> elements) {
		System.out.print(prepend);
		for (int x = 0; x < elements.size(); x++) {
			Double nextNum = elements.get(x);
			System.out.print(String.format("%.2f", nextNum));
			if (x < elements.size() - 1) {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
}
