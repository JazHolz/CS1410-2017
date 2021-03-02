package Printerlab;

public class PrinterApp {

	public static void main(String[]args){
		InkjetPrinter inkPrinter = new InkjetPrinter(1234567);
		System.out.println(inkPrinter);
		System.out.println("Remaining cartridge: "+inkPrinter.getRemainingCartridge()+"%\n");
	
		LaserPrinter lasPrinter = new LaserPrinter(2345678);
		System.out.println(lasPrinter);
		System.out.println("Remaining toner: "+lasPrinter.getRemainingToner()+"%\n");
	
		System.out.println("Array of printers:");
		Printer[] printers = new Printer[2];
		printers[0] = inkPrinter;
		printers[1] = lasPrinter;
		for(Printer currentPrinter : printers){
			System.out.println(currentPrinter);
			currentPrinter.print();
			currentPrinter.print();
			System.out.println("");
		}
	}
}
