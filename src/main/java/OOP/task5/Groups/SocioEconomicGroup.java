package OOP.task5.Groups;

import java.util.ArrayList;

public class SocioEconomicGroup implements Group {

    private ArrayList<Integer> economics;
    private ArrayList<Integer> sociology;
    private ArrayList<Double> history;

    public SocioEconomicGroup() {
        economics = new ArrayList<>();
        sociology = new ArrayList<>();
        history = new ArrayList<>();
    }

    public void setMark(Disciplines discipline, Number t) {
        if (discipline.equals(Disciplines.ECOMOMICS))
            economics.add((Integer) t);
        if (discipline.equals(Disciplines.SOCIOLOGY))
            sociology.add((Integer) t);
        if (discipline.equals(Disciplines.HISTORY))
            history.add((Double) t);
    }

    @Override
    public String subjectMark(Disciplines discipline) {

        if (discipline.equals(Disciplines.ECOMOMICS))
            return "mathematics=" + economics;
        if (discipline.equals(Disciplines.SOCIOLOGY))
            return "phisics=" + sociology;
        if (discipline.equals(Disciplines.HISTORY))
            return "computerScience=" + history;
        return null;
    }

    @Override
    public void clear() {
        economics.clear();
        sociology.clear();
        history.clear();
    }

    @Override
    public String allMarks() {
        return toString();
    }

    @Override
    public String toString() {
        return "SocioEconomicGroup{" +
                "economics=" + economics +
                ", sociology=" + sociology +
                ", history=" + history +
                '}';
    }
}
