package kiryanovao.project10.unversity.employees;

import java.util.*;

import kiryanovao.project10.unversity.work.*;

public class Lecturer extends Research {

    private ArrayList<Course> courses = new ArrayList<>();

    public Lecturer(int ssn, String name, String email) {
        super(ssn, name, email);
    }

    /**
     * @param course
     */
    public String teach(Course course) {
        if (this.courses.contains(course)) {
            return String.format("Преподаватель %s читает курс %s %d раз в неделю", super.name, course.getName(), course.getWeeklyDuration());
        } else {
            return String.format("Преподаватель %s не читает курс %s", super.name, course.getName());
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}