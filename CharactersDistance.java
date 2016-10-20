abstract class CharactersDistance {

	protected int counter;
	protected String implementation;

	abstract double calculate(String c1, String c2);

	public void calculateVerbose(String c1, String c2) {
		long start = System.currentTimeMillis();
		double distance = this.calculate(c1, c2);
		long end = System.currentTimeMillis();
		System.out.println("Méthode " + this.implementation);
		System.out.println("------------------------------------");
		System.out.println("Words: {\"" + c1 + "\", \"" + c2 + "\"}");
		System.out.println("Distance: " + distance);
		System.out.println("Complexity: " + this.counter);
		System.out.println("Time: " + (end - start) + "ms");
		System.out.println("");
	}

	protected double min(double... values) {

		double min = values[0];

		for (double v : values) {
			min = Math.min(min, v);
		}

		return min;
	}

}
