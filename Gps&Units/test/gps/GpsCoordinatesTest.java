package gps;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GpsCoordinatesTest {

	/**
	 * Here are my Tests I used a private GpsCordinates of coords to Test. 
	 */
	
	private GpsCoordinates coords;
	private double lat;
	private double lon;

	@Before
	public void setup() {
		coords = new GpsCoordinates(lat, lon);
	}

	@Test
	public void getLatitude() {
		assertEquals(coords.getLatitude(), lat,.0);
	}
	@Test
	public void getLongitude() {
		assertEquals(coords.getLongitude(), lon, .0);
	}
	@Test
	public void toStringTest() {
		String expected = String.format("%.6f", lat) + " , " + String.format("%.6f", lon);
		assertEquals(coords.toString(), expected);
	}

}

