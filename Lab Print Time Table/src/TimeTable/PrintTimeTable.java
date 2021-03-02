package TimeTable;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintTimeTable {

	public static void main(String[]args){
		try(PrintWriter write = new PrintWriter("TimesTables.txt")){
			write.println("Time Tables: " + "\n");
			for(int i = 1; i <= 10; i++){
				for(int j = 1; j <= 10 ; j++){
					int multiply = i * j;
			// 'printf' to specify the format
					write.printf("%1$2d * %2$2d = %3$d" + "\n", j, i, multiply);
				}
				write.println("");
			}
			
		} catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
