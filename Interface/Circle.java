package A03;

public class Circle implements Shape {

	int radius;

	// Constructor
	public Circle(int radius) {
		this.radius = radius;
	}

	// two public methods: diameter and circumference
	public double diameter() {
		double diameter = radius + radius;
		return diameter;
	}

	public double circumference() {
		double circumference = 2 * Math.PI * radius;
		circumference = Math.round(circumference * 10);
		circumference /= 10;
		return circumference;
	}

	// getter for the field but no setter
	public int getRadius() {
		return radius;
	}

	// toString that returns

	public String toString() {
		return "Circle (" + radius + ")";
	}

	public double perimeter() {
		return circumference();
	}

	public double area() {
		double val = Math.PI * (radius * radius);
		val = Math.round(10 * val);
		val /= 10;
		return val;
	}
}
