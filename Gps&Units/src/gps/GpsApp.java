package gps;

public class GpsApp {
	public static void main(String[] args) {
		// PARAM
		GpsCoordinates SLC = new GpsCoordinates(40.760671, -111.891122);
		System.out.println("Gps coordinates of SLC: " + SLC);

		Gps myGps = new Gps("Jazmine", SLC);
		System.out.println("myGPS: " + myGps);

		for (int i = 1; i < 4; i++) {
			myGps.updatePostion();
			System.out.println("position update" + i + ": " + myGps.getPosition());
		}
	}
}
