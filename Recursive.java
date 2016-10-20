public class Recursive extends CharactersDistance {

	public Recursive() {
		this.implementation = "récursive";
	}

	public double calculate(String c1, String c2) {
		
		this.counter++;
		
		if (c1.equals(c2)) {
			return 0;
		}

		if (c1.length() == 0) {
			return c2.length();
		}
		
		if (c2.length() == 0) {
			return c1.length();
		}

		if (c1.charAt(0) == c2.charAt(0)) {
			return this.calculate(c1.substring(1), c2.substring(1));
		}

		else {
			return this.min(
					Operation.ADD.getCost() + this.calculate(c1, c2.substring(1)), 
					Operation.DELETE.getCost() + this.calculate(c1.substring(1), c2),
					Operation.TRANSFORM.getCost() + this.calculate(c1.substring(1), c2.substring(1))
			);
		}
	}

}
