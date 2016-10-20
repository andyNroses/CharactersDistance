
public class MAIN {

	public static void main(String args[]) {
		new Recursive().calculateVerbose("algorithme", "gorilles");
		new RecursiveCache().calculateVerbose("algorithme", "gorilles");
		new Iterative().calculateVerbose("algorithme", "gorilles");
	}
	
}
