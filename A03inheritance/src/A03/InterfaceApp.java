package A03;

public class InterfaceApp {

	public static void main(String[] args) {

		Rectangle myRectangle = new Rectangle(6, 3);
		Square mySquare = new Square(4);
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(5);
		Circle myCircle = new Circle(7);

		Rectangle myRectangle2 = new Rectangle(5, 4);
		Square mySquare2 = new Square(3);
		IsoscelesRightTriangle myIsoscelesRightTriangle2 = new IsoscelesRightTriangle(3);
		Circle myCircle2 = new Circle(2);

		System.out.println("Shape Array: ");
		System.out.println("------------");

		Shape[] shapes = { myRectangle, myRectangle2, mySquare, mySquare2, myIsoscelesRightTriangle,
				myIsoscelesRightTriangle2, myCircle, myCircle2 };

		for (Shape shape : shapes) {
			System.out.println(shape);
			System.out.println("Perimeter: " + shape.perimeter());
			System.out.println("Area: " + shape.area());

			//If the shape is printable 
			//Cast the shape as a printable object
			//Call print method on the cast
			if(shape instanceof Printable){
				((Printable) shape).print();
			}
			
			
			System.out.println("");

		}
	}

}
