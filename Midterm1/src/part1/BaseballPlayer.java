package part1;

public class BaseballPlayer extends Athlete {
	
	//Here is a Athlete of class Baseball Player

	private double battingAvg;

	public BaseballPlayer(String name, double battingAvg) {
		super(name);
		this.battingAvg = battingAvg;
	}

	public double getBattingAvg() {
		return battingAvg;
	}
	
	public String toString(){
		return super.toString()+" battingAvg: "+battingAvg;
	}
	
	public void practice(){
		System.out.println("hitting the ball");
	}
}
