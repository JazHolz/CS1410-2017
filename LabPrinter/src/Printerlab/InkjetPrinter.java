package Printerlab;

public class InkjetPrinter extends Printer{
	private int remainingCartridge;
	
	public InkjetPrinter(int sNumber){
		super(sNumber);
		remainingCartridge = 100;
	}
	public int getRemainingCartridge(){
		return remainingCartridge;
		
	}
	
	public void print(){
		if(remainingCartridge > 0){
			remainingCartridge -= 10;
			System.out.println("InkjetPrinter is printing. Remaining cartridge: "+remainingCartridge+"%");
		}else if (remainingCartridge == 0){
			System.out.println("Remaining cartridge is empty.");
		}
	}
	
}
