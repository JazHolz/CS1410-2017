package part1;

public class AthleteApp {
	
	//Athlete App which includes the main method

	public static void main(String[] args) {
		Athlete raf = new Athlete("Rafael Nadal");
		Athlete lio = new SoccerPlayer("Lionel Messi", "forward");
		Athlete ted = new BaseballPlayer("Ted Williams", 0.344);
		Athlete[] athletes = { raf, lio, ted };
		
	//Foreach loop for my Current Athlete 
		
		for(Athlete currentAthlete : athletes){
			System.out.println(currentAthlete);
			currentAthlete.practice();
			if(currentAthlete instanceof SoccerPlayer){
				((SoccerPlayer)currentAthlete).headBall();
			}
		}
	}
}
