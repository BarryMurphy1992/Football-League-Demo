package lab7;

public class Player {
	private double age;
	private String position;
	private int goals;

	public Player(int age, String position, int goals) {
		this.age = age;
		this.position = position;
		this.goals = goals;
	}

	public int getNumGoals() {
		return goals;
	}

	public double getAge() {
		return age;
	}

}
