package Interface;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Plane myPlane = new Plane(4, "Boing 747");
		System.out.printf("myPlane: %s%n", myPlane);
		

		Hangglider myHangglider = new Hangglider(true);
		System.out.printf("myHangglider: %s%n", myHangglider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);
		
		System.out.println("");
		
		Flyable [] flyingThings = {myPlane, myHangglider, myBird};
		
		//flyingThings[0] = myPlane;
		//flyingThings[1] = myHangglider;
		//flyingThings[2] = myBird;
		
		for(int x = 0; x < flyingThings.length; x++){
			System.out.println(flyingThings[x]);
			flyingThings[x].launch();
			flyingThings[x].land();
			System.out.println("");
		};
	}

}