package Printerlab;

public abstract class Printer {
	private int serialNumber;

	public Printer(int number) {
		this.serialNumber = number;
	}

	public abstract void print();

	public String toString() {
		return getClass().getSimpleName()+" #"+serialNumber;
	}

}
