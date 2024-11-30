package kiryanovao.project10.unversity.structure;

import java.util.*;
import kiryanovao.project10.unversity.employees.*;

public class Faculty {

	private String name;
	public ArrayList<Institute> institutes = new ArrayList<>();
	private Dean dean;

	public Faculty(String name, Dean dean) {
		this.name = name;
		this.dean = dean;
	}

	public String getName() {
		return name;
	}

	public Dean getDean() {
		return dean;
	}

	public void printInfo() {
		System.out.println("~~" + this.name + "~~");
		System.out.println("Декан:" + dean.getName());
		System.out.println("Кафедры:");
		for (Institute institute : institutes) {
			System.out.println("--" + institute.getName());
		}
	}
}