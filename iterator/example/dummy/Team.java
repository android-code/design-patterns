public class Team {

	private String name;
	private int position;
	private int points;
	private int goalsGained, goalsLost;

	public Team(String name, int position, int points, int goalsGained, int goalsLost) {
		this.name = name;
		this.position = position;
		this.points = points;
		this.goalsGained = goalsGained;
		this.goalsLost = goalsLost;
	}

	public int getGainedGoals() {
		return goalsGained;
	}

	//other getter and setter

	//some methods
}