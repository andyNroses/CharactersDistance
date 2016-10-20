import java.util.HashMap;

public class RecursiveCache extends CharactersDistance {

	private static HashMap<String, Double> cache = new HashMap<String, Double>();
	
	public RecursiveCache() {
		this.implementation = "récursive avec cache";
	}
	
	public double calculate(String c1, String c2) {
		
		this.counter++;
		
		if(cache.containsKey(c1.concat("," + c2))) {
            return cache.get(c1.concat("," + c2));
        }

        if(c1.equals(c2)) {
            return 0;
        }

        if(c1.length() == 0) {
            return c2.length();
        }
        if(c2.length() == 0) {
            return c1.length();
        }

        if(c1.charAt(0) == c2.charAt(0)) {
            double d = this.calculate(c1.substring(1), c2.substring(1));
            cache.put(c1.concat("," + c2), d);
            return d;
        }

        else {
            double d = this.min(
            		Operation.ADD.getCost() + this.calculate(c1, c2.substring(1)),
                    Operation.DELETE.getCost() + this.calculate(c1.substring(1), c2),
                    Operation.TRANSFORM.getCost() + this.calculate(c1.substring(1), c2.substring(1))
                    );
            cache.put(c1.concat("," + c2), d);
            return d;
        }
	}
	
}
