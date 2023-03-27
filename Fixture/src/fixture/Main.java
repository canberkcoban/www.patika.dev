package fixture;

public class Main {

	public static void main(String[] args) {

		SoccerTeams soccerTeams = new SoccerTeams();
		soccerTeams.soccerTeamName.add("Galatasaray");
		soccerTeams.soccerTeamName.add("Besiktas");
		soccerTeams.soccerTeamName.add("Fenerbahce");
		soccerTeams.soccerTeamName.add("Adana Demirspor");
		soccerTeams.soccerTeamName.add("Luleburgazspor");
		soccerTeams.soccerTeamName.add("Karagumruk");
		soccerTeams.soccerTeamName.add("Eskisehir");
		soccerTeams.soccerTeamName.add("Sivasspor");

		soccerTeams.runFixture();
		
	}

}
