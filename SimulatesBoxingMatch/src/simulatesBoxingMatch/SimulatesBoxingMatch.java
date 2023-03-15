package simulatesBoxingMatch;

public class SimulatesBoxingMatch {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("Mike", 10, 100, 90, 50);
		Fighter f2 = new Fighter("John", 20, 100, 105, 50);
		
		Match match = new Match(f1, f2, 90, 110);
		match.run();
	}

}
