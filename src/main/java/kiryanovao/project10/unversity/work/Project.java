package kiryanovao.project10.unversity.work;

import java.time.LocalDate;

public class Project {

	private String name;
	private int hours;
	private LocalDate startingDate;
	private LocalDate endDate;

	public Project(String name, int hours, LocalDate startingDate, LocalDate endDate) {
		this.name = name;
		this.hours = hours;
		this.startingDate = startingDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public int getHours() {
		return hours;
	}

	public LocalDate getStartingDate() {
		return startingDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
}