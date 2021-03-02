package part1;

public class SoccerPlayer extends Athlete{
	
	//Here is a Athlete of class Soccer Player

	private String position;
	
	public SoccerPlayer(String name, String position){
		super(name);
		this.position = position;
	}
	
	public String getPosition(){
		return position;
	}
	
	public void headBall(){
		System.out.println("A "+position+" is heading the ball\n");
	}
	
	public void practice(){
		System.out.println("kicking the ball");
	}
	

}
