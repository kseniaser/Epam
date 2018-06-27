package OOP.task5;

import OOP.task5.Groups.*;

import java.util.HashMap;
import java.util.Objects;

public class Student {

    private String name;
    private static HashMap<String, Group> group;

    public Student(String name) {
        this.name = name;
        group = new HashMap<>();
    }

    public static void setMark(Disciplines discipline, Number t) {
        group.get(discipline.getGroup()).setMark(discipline, t);
    }

    public void Subscribe(Disciplines discipline) {
        if (discipline.getGroup().equals("MathGroup"))
            group.put("MathGroup", new MathGroup());
        if (discipline.getGroup().equals("BiologyGroup"))
            group.put("BiologyGroup", new BiologyGroup());
        if (discipline.getGroup().equals("SocioEconomicGroup"))
            group.put("SocioEconomicGroup", new SocioEconomicGroup());
    }

    public void UnSubscribe(Disciplines discipline) {
        group.remove(discipline.getGroup());
    }

    public String subjectMark(Disciplines discipline) {
        return group.get(discipline.getGroup()).subjectMark(discipline);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group.values() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        final Student student;
        return o == this
                || o instanceof Student
                && (student = (Student) o).canEqual(this)
                && Objects.equals(name, student.name);
    }

    private boolean canEqual(Object other) {
        return other instanceof Student;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
