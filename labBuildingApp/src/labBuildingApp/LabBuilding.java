package labBuildingApp;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LabBuilding extends JPanel {
	/**
	 * This is where i created each variable that would be used, theBuilding,
	 * theDoor, and the Windows Width&Length, and the Start points for X and Y
	 * the Spacing in between the windows
	 */
	private int hOfBuild = 400;
	private int wOfBuild = 360;
	private int xOfBuild = 25;
	private int yOfBuild = 25;

	private int xDoor = wOfBuild / 2;
	private int yDoor = hOfBuild - 20;
	private int wDoor = 50;
	private int hDoor = 45;

	private int xStart = 35;
	private int yStart = 45;
	private int wWind = 25;
	private int hWind = 35;

	private int xSpace = 20;
	private int ySpace = 20;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		/**
		 * Here is the methods I am using to create my Building
		 */
		Random randomGenerator = new Random();
		
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLACK);
		g.fillRect(xOfBuild, yOfBuild, wOfBuild, hOfBuild);
		
		g.setColor(Color.WHITE);
		g.fillRect(xDoor, yDoor, wDoor, hDoor);
		
		/**
		 * This is the loops to create the Windows
		 */

		for (int y = yStart; y + hWind <= yOfBuild + hOfBuild; y += hWind + ySpace) {
			for (int x = xStart; x + wWind <= xOfBuild + wOfBuild; x += wWind + xSpace) {
				if (x + wWind < xDoor || x > xDoor + wDoor) {
					if (xDoor < yDoor + hDoor) {
						// This sets newCol to randomGenerator to get each
						// 'Rect' to have it's own color.
						Color newCol = new Color(randomGenerator.nextInt(256), randomGenerator.nextInt(256),
								randomGenerator.nextInt(256));
						g.setColor(newCol);
						g.fillRect(x, y, wWind, hWind);
					}
				}
			}
		}
	}
}