package OOP.task5.Groups;

import java.util.ArrayList;

public class MathGroup implements Group {

    private ArrayList<Integer> mathematics;
    private ArrayList<Integer> phisics;
    private ArrayList<Double> computerScience;

    public MathGroup() {
        mathematics = new ArrayList<>();
        phisics = new ArrayList<>();
        computerScience = new ArrayList<>();
    }

    public void setMark(Disciplines discipline, Number t) {
        if (discipline.equals(Disciplines.MATHEMATICS))
            mathematics.add((Integer) t);
        if (discipline.equals(Disciplines.PHYSICS))
            phisics.add((Integer) t);
        if (discipline.equals(Disciplines.COMPUTER_SCIENCE))
            computerScience.add((Double) t);
    }

    @Override
    public String subjectMark(Disciplines discipline) {

        if (discipline.equals(Disciplines.MATHEMATICS))
            return "mathematics=" + mathematics;
        if (discipline.equals(Disciplines.PHYSICS))
            return "phisics=" + phisics;
        if (discipline.equals(Disciplines.COMPUTER_SCIENCE))
            return "computerScience=" + computerScience;
        return null;
    }

    @Override
    public void clear() {
        mathematics.clear();
        phisics.clear();
        computerScience.clear();
    }

    @Override
    public String allMarks() {
        return toString();
    }

    @Override
    public String toString() {
        return "MathGroup{" +
                "mathematics=" + mathematics +
                ", phisics=" + phisics +
                ", computerScience=" + computerScience +
                '}';
    }
}
