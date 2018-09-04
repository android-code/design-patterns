public class Main {

	public static void main() {
		//get data from server
		//get list of teams from choosen league with points and scores
		List<Team> teams = new ArrayList<>();
		teams.add(new Team("AC Milan", 1, 50, 86, 25));
		teams.add(new Team("Juventus FC", 2, 47, 72, 23));
		teams.add(new Team("AS Roma", 3, 43, 50, 12));
		teams.add(new Team("SSC Napoli", 4, 40, 95, 45));
		teams.add(new Team("Inter Milan", 5, 38, 63, 39));
		//etc

		//show table of the league
		for(Team team : teams) {
		    //add to the table
		}

		//user choose filter to show data only for teams with min 60 goals scored
		//for each loop is not enough because of removing elements
		Iterator<Team> iterator = teams.iterator();
		for(iterator; iterator.hasNext();) {
		    Team team = iterator.next();
		    if(team.getGainedGoals() < 60) {
		        //those teams are no longer needed for user processes
		        iterator.remove(); //AS Roma and Inter Milan removed
		    }
		    else {
		        //add to filtered table
		    }
		}
	}
}
