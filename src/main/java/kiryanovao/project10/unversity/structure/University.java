package kiryanovao.project10.unversity.structure;

import java.util.*;

public class University {

    private String name;

    public University(String name) {
        this.name = name;
    }

    public ArrayList<Faculty> faculties = new ArrayList<>();
    private int numberOfEmployees;

    public void printInfo() {
        System.out.println("==" + this.name + "==");
        System.out.println("Факультеты:");
        for (Faculty faculty : faculties) {
            System.out.println("::" + faculty.getName());
        }
    }


}