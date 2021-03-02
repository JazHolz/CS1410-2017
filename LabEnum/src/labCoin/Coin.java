package labCoin;

	public enum Coin {
		CENT(2.5, 19.1), 
		NICKEL(5.0, 21.2), 
		DIME(2.3, 17.9), 
		QUARTER(5.7, 24.3);
	
	private double weight;
	private double diameter;

	Coin(double weight,double diameter){
		this.weight = weight;
		this.diameter = diameter;
	}
	
	@Override 
	public String toString() { 
		return this.name()+":" + " w:" + weight + " d:" + diameter;
		}

	}

