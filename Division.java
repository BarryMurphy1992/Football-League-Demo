package lab7;
import java.util.ArrayList;

public class Division {
	private String name;
	private ArrayList<Team> teams = new ArrayList<Team>();

	public Division(String name) {
	this.name = name;	
	}

	public void add(Team team) {
		teams.add(team);
		
	}

	public int getNumTeams() {
		return teams.size();
	}

	public int getNumDivGoals() {
		int total=0 ;
		
		for(Team team : teams){
			total = total + team.getNumGoals();	
		}
		return total;

	}

	public String getName() {
		return this.name;
	}

	public int getNumTeamGoals(String teamName) {
		int total = 0 ;
		
		
		for(Team team : teams){
			if(team.getName() == teamName){
				total = total +team.getNumTeamGoals();
				
			}
		}
		return total;
		
	}

	public double getAvgAge(String teamName) {
		double total = 0;
		
		for(Team team : teams){
			if(team.getName() == teamName){
			total = total + team.getAvgAge(teamName);
		}
		}
		return total;	
	}

}
