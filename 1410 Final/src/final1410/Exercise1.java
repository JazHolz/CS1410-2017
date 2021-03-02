//Jazmine Mehri Lavasani
//CS1410 Final Project

package final1410;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exercise1 {

	public static void main(String[] args) {

		ArrayList<String> text = new ArrayList<String>();
		text.add("Tom is born on Feb 2nd 1999.");
		text.add("He is 17 years old.");

		for(String str : text){
			System.out.println(str);
		}
		System.out.print("\n");
		
		System.out.println("creating file Modified.txt\n");
		File fil = new File("src/final1410/Modified.txt");
		try {
			PrintWriter writer = new PrintWriter(fil);
			
			
			for(int x=0 ; x<text.size(); x++){
				String str = text.get(x);
				for(char ch : str.toCharArray()){
					if(Character.isDigit(ch)){
						ch = '#';
					}
					writer.write(ch);
				}
				if(x!=text.size()-1){
					writer.write("\n");
				}
			}
			writer.flush();
			writer.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		for(String str : text){
			System.out.println(str);
		}
	}
}
