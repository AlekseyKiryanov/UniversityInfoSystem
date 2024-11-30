package kiryanovao.project10.unversity.structure;

import java.util.*;
import kiryanovao.project10.unversity.employees.*;

public class Institute {

	private String name;
	private String address;
	private ArrayList<Employee> employees = new ArrayList<>();

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}
}