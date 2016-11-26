package lab7;
import java.util.ArrayList;



public class League {
	private String name;
	private ArrayList <Division> divisions = new ArrayList<Division>();
	
	public League(String name) {
		this.name = name;
	}

	public void add(Division div) {
		divisions.add(div);
		
	}

	public int getNumDivs() {
		return divisions.size();
		
	}

	public  int getNumTeams() {
		int total=0 ;
		
		for(Division div : divisions){
			total = total + div.getNumTeams();	
		}
		return total;
	}

	public int getNumDivGoals(String divName) {
		int total=0 ;
		
		for(Division div : divisions){
			if(div.getName() == divName){
			total = total + div.getNumDivGoals();	
			}
		}
		return total;

	}

	public int getNumTeamGoals(String teamName) {
		int total = 0;
		
		for(Division div : divisions){
			total = total +div.getNumTeamGoals(teamName);
		}
		return total;
		
		
	}

	public double getAvgAge(String teamName) {
		double total = 0;
		
		for(Division div : divisions){
			total = total +div.getAvgAge(teamName);
		}
		return total;
	}

}
