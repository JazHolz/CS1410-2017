package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExceptionHandling 
{
	public static void main(String[] args) {
		try {
			int digit = numberFromUser();
			int result = sevenModulusN(digit);
			System.out.printf("7 %% %d = %d", digit, result);
		} catch (Exception e) {
			System.out.println("A problem occured" + e.getMessage());
		}
	}

	private static int numberFromUser() {
		
		
		Scanner input = new Scanner(System.in);
		Integer number = null;
		
		while(number == null){
			try {
				System.out.print("number: "+ "\n");
				number = input.nextInt();
			} catch (InputMismatchException e) {
				input.next();
				System.out.print("The number entered needs to be a whole number \n");
			}
		} 
		return number;
	}

	private static int sevenModulusN(int number) {
		if(number == 0){
			throw new IllegalArgumentException("Can't calucate 7 % 0 ");
		}
		return 7 % number;
	}
}
