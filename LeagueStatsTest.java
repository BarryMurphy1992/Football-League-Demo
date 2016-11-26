package lab7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LeagueStatsTest {
	
	LeagueStats myLeague = new LeagueStats();

	@Before
	public void setUp() throws Exception {
		League league = new League("Name of league");
		myLeague.add(league);
		
		Division div1 = new Division("Division 1");
		Division div2 = new Division("Division 2");
		
		league.add(div1);
		league.add(div2);
		
		Team team1 = new Team("Team 1",4);
		Team team2 = new Team("Team 2",1);
		Team team3 = new Team("Team 3",1);
		Team team4 = new Team("Team 4",3);
		
		div1.add(team1);
		div1.add(team2);
		div2.add(team3);
		div2.add(team4);
		
		Player player1 = new Player(22 , "Full Back",6);
		Player player2 = new Player(32 , "Keeper",0);
		
		Player player3 = new Player(24 , "Centre Forward",15);
		Player player4 = new Player(29 , "Full back",1);
		
		Player player5 = new Player(36 , "Mid Field",9);
		Player player6 = new Player(19 , "Mid Field",7);
		
		Player player7 = new Player(35 , "Mid Field",5);
		Player player8 = new Player(33 , "Right Back",7);
		
		team1.add(player1);
		team1.add(player2);
		
		team2.add(player3);
		team2.add(player4);
		
		team3.add(player5);
		team3.add(player6);
		
		team4.add(player7);
		team4.add(player8);
	
		
		


	}

	@Test
	public void getNumDivsTest() {
		int expected = 2;
		
		int actualValue = myLeague.getNumDivs();
		
		assertEquals(expected , actualValue);
	}
	
	@Test
	public void getNumTeamsTest() {
		int expected = 4;
		
		int actualValue = myLeague.getNumTeams();
		assertEquals(expected,actualValue);
	}
	
	@Test
	public void getNumGoalsDivTest() {
		int expected = 22;
		
		int actualValue = myLeague.getNumGoalsDiv("Division 1");
		
		assertEquals(expected, actualValue);
		
	}
	
	
	@Test
	public void getNumGoalsTeamTest() {
		int expected = 6;
		
		int actualValue = myLeague.getNumGoalsTeam("Team 1");
		
		assertEquals(expected, actualValue);
		
	}
	
	@Test
	public void getAvgAgeTest() {
		double expected = 27;
		
		double actualValue = myLeague.getAvgAge("Team 1");
		
		assertEquals(expected,actualValue , .0001 );
		
		
	}

}
