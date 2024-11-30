package kiryanovao.project10.unversity.work;

public class Course {

	private int id;
	private String name;
	private int weeklyDuration;

	public Course(int id, String name, int weeklyDuration) {
		this.id = id;
		this.name = name;
		this.weeklyDuration = weeklyDuration;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getWeeklyDuration() {
		return this.weeklyDuration;
	}

	
}