package A03;

public class Rectangle implements Shape, Printable {

	private int length;
	private int width;

	// Constructor
	// Param is a local var
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// getter (get accessor method) for each of the fields (no setter)
	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
	// toString

	@Override
	public String toString() {
		return "Rectangle (" + length + "x" + width + ")";
	}

	public double perimeter() {
		return (length * 2) + (width * 2);
	}

	public double area() {
		return length * width;
	}

	public void print() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				// System.out.println(j);
				if (i == 0 || i == width - 1) {
					System.out.print("o ");
				} else if (j == 0 || j == length - 1) {
					System.out.print("o ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println("");
		}
	}

}
