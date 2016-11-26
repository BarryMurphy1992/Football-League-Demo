package lab7;

public class LeagueStats {
	private League league; 

	public void add(League league) {
		this.league = league;
		
	}

	public int getNumDivs() {
		return league.getNumDivs();
	}

	public int getNumTeams() {
		return league.getNumTeams();
	}

	public int getNumGoalsDiv(String divName) {
		return league.getNumDivGoals(divName);
	}

	public int getNumGoalsTeam(String teamName) {
		return league.getNumTeamGoals(teamName);
	}

	public double getAvgAge(String teamName) {
		return league.getAvgAge(teamName);
	}

}
