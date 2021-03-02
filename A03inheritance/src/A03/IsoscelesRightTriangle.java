package A03;

public class IsoscelesRightTriangle implements Shape, Printable {

	int legSize;

	// one parameterized constructor that initializes the field
	public IsoscelesRightTriangle(int legSize) {
		this.legSize = legSize;
	}

	// public method called hypotenuse that returns a value of type double
	public double hypotenuse() {
		double value = Math.sqrt(2 * (Math.pow(legSize, 2)));
		value = Math.round(value * 10);
		value /= 10;

		return value;
	}

	// getter for the field but no setter
	public int getIsoscelesRightTriangle() {
		return legSize;
	}

	// toString method should return a String
	public String toString() {
		return "IsoscelesRightTriangle (" + legSize + ")";
	}

	public double perimeter() {
		return (legSize * 2) + hypotenuse();
	}

	public double area() {
		return (legSize * legSize) / 2;

	}

	public void print() {

		for (int x = 0; x < legSize; x++) {
			for (int y = 0; y < legSize; y++) {

				if (x == legSize - 1 || y == x || y == 0) {
					System.out.print("o ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}

	}

}
