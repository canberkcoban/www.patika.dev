package fixture;

import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class SoccerTeams {

	 List<String> soccerTeamName = new LinkedList<>();


	    public void runFixture() {
	        if (soccerTeamName.size() % 2 != 0) {
	        	soccerTeamName.add(this.getClass().getSimpleName() + " do not have a match this week!");
	        }

	        if (soccerTeamName.size() != 0) {
	            System.out.println("The Turkish Football Club Teams: ");
	            for (String soccerName : soccerTeamName) {
	                System.out.println(" - " + soccerName);
	            }


	        }
	
	        System.out.println();
	        fixture();
	    }


	    private void fixture() {
	        List<String> soccerTeamList = new LinkedList<>();
	        
	        int match = 2 * (soccerTeamName.size() - 1);

	        List<String> soccerTeamList2 = new LinkedList<>(soccerTeamName);

	        int fullFixture = (soccerTeamName.size() / 2);

	        for (int i = 1; i < match / 2 + 1; i++) {
	            for (int j = 0; j <= fullFixture + 2; j += 2) {
	            	soccerTeamList.add(soccerTeamList2.get(j) + " " + soccerTeamList2.get(j));
	            }
	            
            soccerTeamList2.add(1, soccerTeamList2.get(fullFixture));
            soccerTeamList2.add(fullFixture, soccerTeamList2.get (soccerTeamList2.size() - 1));
            soccerTeamList2.remove(soccerTeamList2.size() - 1);
            soccerTeamList2.remove (soccerTeamList2.size() - 2);
	        }

	        for (int i = match / 2 + 2; i <= match + 1; i++) {
	            for (int k = 0; k <= fullFixture + 2; k += 2) {
	            	soccerTeamList.add (soccerTeamList2.get(k + 1) + " " + soccerTeamList2.get(k));
	            }
            soccerTeamList2.add(1, soccerTeamList2.get(fullFixture));
            soccerTeamList2.add(fullFixture, soccerTeamList2.get (soccerTeamList2.size() - 1));
            soccerTeamList2.remove (soccerTeamList2.size() - 1);
            soccerTeamList2.remove (soccerTeamList2.size() - 2);
	        }

	        int count = 0;
	        
	        for (int i = 1; i <= match; i++) {
	            System.out.println("Fixtures of Turkish League Football Teams, respectively: " + i);
	            List<String> respectivelyFixtureList = new LinkedList<>();
	            for (int l = count; l < count + fullFixture; l++) {
	            	respectivelyFixtureList.add(soccerTeamList.get(l));

	            }

	            for (int m = 0; m < fullFixture; m++) {
	            	int number = new Random().nextInt(respectivelyFixtureList.size());
	                System.out.println(respectivelyFixtureList.get(number));
	                respectivelyFixtureList.remove(number);
	            }
	            
	            System.out.println();
	            count += fullFixture;
	            
	        }
	    }
}
