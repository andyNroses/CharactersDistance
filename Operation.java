
public enum Operation {
	
	ADD(1),
	DELETE(1),
	TRANSFORM(1.5);
	
	private double cost;
	
	Operation(double c) {
		this.cost = c;
	}
	
	public double getCost() {
		return cost;
	}
	
}
