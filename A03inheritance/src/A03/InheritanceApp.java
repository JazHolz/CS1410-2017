package A03;

public class InheritanceApp {
	public static void main(String[] args) {

		Rectangle myRectangle = new Rectangle(5, 4);
		System.out.println(myRectangle);
		System.out.println("Length: " + myRectangle.getLength());
		System.out.println("Width: " + myRectangle.getWidth());

		System.out.println();

		Square mySquare = new Square(4);
		System.out.println(mySquare);
		System.out.println("Side: " + mySquare.getSide());

		System.out.println();

		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(5);
		System.out.println("IsoscelesRightTriangle (" + myIsoscelesRightTriangle + ")");
		System.out.println("Leg: " + myIsoscelesRightTriangle.getIsoscelesRightTriangle());
		System.out.println("Hypotenuse: " + myIsoscelesRightTriangle.hypotenuse());

		System.out.println();

		Circle myCircle = new Circle(4);
		System.out.println("Circle (" + myCircle + ")");
		System.out.println("Diameter: " + myCircle.diameter());
		System.out.println("Circumference: " + myCircle.circumference());
		System.out.println("Radis: " + myCircle.getRadius());

		System.out.println();
		System.out.println();

		/**
		 * Try to call getSide. What happens?
		 * 
		 */

		Rectangle rectangle2 = mySquare;
		System.out.println("rectangle2: ");
		System.out.println("-----------");
		System.out.println(mySquare);
		System.out.println("Length: " + myRectangle.getLength());
		System.out.println("Width: " + myRectangle.getWidth());
		System.out.println();

		System.out.println("Rectangle Array: ");
		System.out.println("----------");

		Rectangle[] recTangles = { rectangle2, mySquare, myRectangle };
		// \n creates a next line
		for (Rectangle rect : recTangles) {
			System.out.println(rect);
			System.out.println("Length: " + rect.getLength());
			System.out.println("Width: " + rect.getWidth() + "\n");

		}

	}
}
