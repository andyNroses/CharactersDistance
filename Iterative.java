public class Iterative extends CharactersDistance {

	public Iterative() {
		this.implementation = "itérative";
	}

	public double calculate(String c1, String c2) {
		
		double[][] C = new double[c1.length() + 1][c2.length() + 1];
		double d1, d2, d3;

		for (int j = 0; j < c2.length() + 1; j++) {
			for (int i = 0; i < c1.length() + 1; i++) {
				
				this.counter++;
				
				if (i == 0) {
					C[i][j] = j; 
				}

				else if (j == 0) {
					C[i][j] = i;
				}

				else {
					d1 = C[i - 1][j] + Operation.ADD.getCost();
					d2 = C[i][j - 1] + Operation.DELETE.getCost();
					d3 = C[i - 1][j - 1] + (c1.charAt(i - 1) == c2.charAt(j - 1) ? 0 : Operation.TRANSFORM.getCost());
					C[i][j] = Math.min(Math.min(d1, d2), d3);
				}
			}
		}

		return C[c1.length()][c2.length()];
	}

}
