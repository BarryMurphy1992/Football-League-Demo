package lab7;
import java.util.ArrayList;

public class Team {
	private String name;
	private int trophies;
	private ArrayList<Player> players = new ArrayList<Player>();

	public Team(String name, int trophies) {
		this.name = name;
		this.trophies = trophies;
	}

	public void add(Player player) {
		players.add(player);
		
	}

	public int getNumGoals() {
		int total=0 ;
		
		for(Player player : players){
			total = total + player.getNumGoals();	
		}
		
		return total;

	}
	
	public String getName(){
		return this.name;
	}

	public int getNumTeamGoals() {
		int total = 0;
		for(Player player : players){
			total = total + player.getNumGoals();
			}
		return total;
		}

	public double getAvgAge(String teamName) {
		double total = 0;
		double numPlayers = 0;
		
		for(Player player : players){
			total = total + player.getAge();
			numPlayers++;
		}
		return total/numPlayers;
	}
	}


