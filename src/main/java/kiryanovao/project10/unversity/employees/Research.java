package kiryanovao.project10.unversity.employees;

import java.util.ArrayList;

import kiryanovao.project10.unversity.work.*;

public class Research extends Employee {

    private ArrayList<Project> projects = new ArrayList<>();

    public Research(int ssn, String name, String email) {
        super(ssn, name, email);
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public String works(Project project) {
        if (this.projects.contains(project)) {
            return String.format("�?сследователь %s работает над проектом %s", super.name, project.getName());
        } else {
            return String.format("�?сследватель %s не работает над проектом %s", super.name, project.getName());
        }
    }
}