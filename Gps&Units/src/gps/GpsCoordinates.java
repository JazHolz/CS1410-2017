package gps;

public class GpsCoordinates {
	/**
	 * These are my private variables.
	 */
	private double latitude;
	private double longitude;
	/**
	 * I set my Param list for GpsCoordinates to a Double with the variable.
	 * as well are used this. to set latitude and longitude to lat and lon.
	 * @param lat
	 * @param lon
	 */
	public GpsCoordinates(double lat, double lon){
		this.latitude = lat;
		this.longitude = lon;
	}
	/**
	 * Simple enough I set getLatitude to return the latitude.
	 * same with getLongitude
	 * @return
	 */
	public double getLatitude(){
		return  latitude;
	}
/**
 * Setting Latitude to Lat.
 * also set Longitude to lon
 * @param lat
 */
	public void setLatitude(double lat){
		latitude = lat;
	}

	public double getLongitude(){
		return longitude;
	}
	public void setLongitude(double lon){
		longitude = lon;
	}
	/**
	 * In my toString I used a string.format with a float of .6f to get that 6 decimal points. 
	 */
	public String toString(){
		return ( String.format("%.6f", getLatitude()) + " , " + String.format("%.6f", getLongitude()));
	}
	}


