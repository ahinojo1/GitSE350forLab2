package Lab2;

import java.awt.Point;

public class Ship {
	private int positionX = 0;
	private int positionY = 0;
	Point shipLocation = new Point(positionX,positionY);
	
	public Ship(int x, int y) {
		positionX = x;
		positionY = y;
	}
	
	public void setShipLocation() {
		//shipLocation(positionX, positionY);
	}
	public Point getShipLocation() {
		return shipLocation;
		
	}

}
