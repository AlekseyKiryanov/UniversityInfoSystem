package kiryanovao.project10;

import kiryanovao.project10.unversity.employees.Dean;
import kiryanovao.project10.unversity.employees.Lecturer;
import kiryanovao.project10.unversity.employees.Research;
import kiryanovao.project10.unversity.structure.Faculty;
import kiryanovao.project10.unversity.structure.Institute;
import kiryanovao.project10.unversity.structure.University;
import kiryanovao.project10.unversity.work.Course;
import kiryanovao.project10.unversity.work.Project;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        University univ = new University("ВГУ");
        Dean csDean = new Dean(1, "Крыловецкий Александр Абрамович", "example@gmail.com");
        Dean physDean = new Dean(2, "Овчинников Олег Владимирович", "example@gmail.com");
        Faculty cs = new Faculty("ФКН", csDean);
        Faculty phys = new Faculty("Физический", physDean);
        Institute toizi = new Institute("Технологий обработки и защиты информации", "Университетская пл, 1а");
        Institute is = new Institute("�?нформационных систем", "Университетская пл, 1б");
        univ.faculties.add(cs);
        univ.faculties.add(phys);
        cs.institutes.add(toizi);
        cs.institutes.add(is);
        univ.printInfo();
        cs.printInfo();
        Lecturer lect1 = new Lecturer(3, "Гаршина Вероника Викторовна", "example@gmail.com");
        Lecturer lect2 = new Lecturer(4, "Сирота Александр Анатольевич", "example@gmail.com");
        Research research = new Research(5, "Дрюченко Михаил Анатольевич", "example@gmail.com");
        toizi.getEmployees().add(lect1);
        toizi.getEmployees().add(lect2);
        toizi.getEmployees().add(research);
        Course course1 = new Course(1, "Введение в �?С", 1);
        Course course2 = new Course(2, "Нейронные сети", 2);
        lect1.getCourses().add(course1);
        lect2.getCourses().add(course2);
        System.out.println(lect1.teach(course1));
        System.out.println(lect1.teach(course2));
        Project project = new Project("Сегментация листьев", 12, LocalDate.of(2024, 9, 1), LocalDate.of(2024, 12, 31));
        research.getProjects().add(project);
        System.out.println(research.works(project));
    }
}