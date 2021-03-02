package part1;

public class Athlete {

	// this is my Athlete class
	
	private String name;
	
	public Athlete(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void practice(){
		System.out.println("practicing\n");
	}
	
	public String toString(){
		return getClass().getSimpleName()+": "+name;
	}
}
