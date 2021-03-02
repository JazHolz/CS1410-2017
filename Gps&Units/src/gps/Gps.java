package gps;

public class Gps {
/**
 * This is where I set up my Variable.
 */
	private String name;
	private GpsCoordinates position;
/**
 * I've set in Gps's Param list String n and GpsCoordinates pos.
 * I have also used this. to identify name as (n) and position as (pos).
 * @param n
 * @param pos
 */

	public Gps(String n, GpsCoordinates pos) {
		this.name = n;
		this.position = pos;
	}
/**
 * Here is Update Position this is where I have set the variable
 * Latitude to equal = the position of getLatitude plus random numbers with a -2.5 change.
 * I did the exact same thing to the Longitude.
 */
	public void updatePostion() {
		double latitude = (position.getLatitude() + ((Math.random() * 5) - 2.5));
		position.setLatitude(latitude);
		double longitude = (position.getLongitude() + ((Math.random() * 5) - 2.5));
		position.setLongitude(longitude);
	}
/**
 * In getPosition I set it to return the position of the toString.
 * @return
 */
	public String getPosition() {
		return position.toString();
	}
/**
 * This is the toString where it is set to return name plus the position.
 */
	@Override
	public String toString() {
		return (name + ": " + position);
	}

}
