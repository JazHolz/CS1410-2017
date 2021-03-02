package generics;

public class Square {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	@Override
	public boolean equals(Object obj){
		boolean equals = false;
		if (obj instanceof Square){
			Square otherSquare = (Square)obj;
			if(side == otherSquare.getSide()){
				equals = true;
			}
		} 
		return equals;
	}
	
	public int hashCode(){
		return side;
	}

	@Override
	public String toString() {
		return "S:" + side;
	}
}