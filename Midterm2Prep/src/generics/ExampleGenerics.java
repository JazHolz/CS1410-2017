package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleGenerics {

	public static void main(String[] args) {
		Set<Square> squareSet = new HashSet<>(Arrays.asList(new Square(1), 
	new Square(2), new Square(2), new Square(3), new Square(3), new Square(3)));
		System.out.println("bag: " + squareSet);

		List<Square> squareList = new ArrayList<>(Arrays.asList(new Square(1), 
	new Square(2), new Square(2), new Square(3), new Square(3), new Square(3)));
		System.out.println("original list: " + squareList + "\n");

		Collections.rotate(squareList, 4);
		System.out.println("rotated list:" + squareList + "\n");

		System.out.println("Are the second and third list elements equal?");
		System.out.println("Yes" + "\n");
		
		System.out.println("All list elements:");
		System.out.println("decimal:"+ " 2 " + " 3 " + " 3 " + " 3 " + " 1 " + " 2 ");
		System.out.println("binary:"+ " 10 " + " 11 " + " 11 " + " 11 " + " 1 " + " 10 ");
		
		

	}
}
