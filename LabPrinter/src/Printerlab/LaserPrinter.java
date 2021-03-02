package Printerlab;

public class LaserPrinter extends Printer{
	private int remainingToner;
	
	public LaserPrinter(int sNumber){
		super(sNumber);
		remainingToner = 100;
	}
	public int getRemainingToner(){
		return remainingToner;
	}

	public void print(){
		if(remainingToner > 0){
			remainingToner -= 10;
			System.out.println("LaserPrinter is printing. Remaining toner: "+remainingToner+"%");
		}else if (remainingToner == 0){
			System.out.println("Remaining toner is empty.");
		}
	}
}
