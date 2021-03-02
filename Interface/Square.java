package A03;

// Square extends rectangle
public class Square extends Rectangle {
	// No fields

	// Constructor with one Parameter
	public Square(int sideLength) {
		super(sideLength, sideLength);
	}

	// getSide to expose the side-length of the square
	public int getSide() {
		return super.getLength();
	}

	@Override
	public String toString() {
		return "Square (" + getSide() + ")";

	}
}
