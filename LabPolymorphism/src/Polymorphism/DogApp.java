package Polymorphism;

public class DogApp {
	public static void main(String[] args) {
		Dog myDog = new Dog("Greyhound");
		System.out.println(myDog);
		actAsDog(myDog);

		SledDog mySledDog = new SledDog("Husky");
		System.out.println(mySledDog);
		actAsDog(mySledDog);

		CircusDog myCircusDog = new CircusDog("Terrier");
		System.out.println(myCircusDog);
		actAsDog(myCircusDog);

		System.out.println("Using an Array: " + "\n");

		Dog[] dogTypes = { myDog, mySledDog, myCircusDog };
		dogTypes[0] = myDog;
		dogTypes[1] = mySledDog;
		dogTypes[2] = myCircusDog;

		for (Dog current : dogTypes) {
			System.out.println(current);

			if (current instanceof SledDog) {
				((SledDog) current).pullSled();
			}
			actAsDog(current);

		}
	}

	private static void actAsDog(Dog d) {
		d.communicate();
		d.move();
		System.out.println();
	}
}