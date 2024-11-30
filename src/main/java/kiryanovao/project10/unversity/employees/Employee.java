package kiryanovao.project10.unversity.employees;

public abstract class Employee {

	private int ssn;
	protected String name;
	private String email;

	public Employee(int ssn, String name, String email) {
		this.ssn = ssn;
		this.name = name;
		this.email = email;
	}

	public int getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}