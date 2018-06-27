package OOP.task5.Groups;

import java.util.ArrayList;

public class BiologyGroup implements Group {

    private ArrayList<Integer> biology;
    private ArrayList<Integer> chemistry;
    private ArrayList<Double> latin;

    public BiologyGroup() {
        biology = new ArrayList<>();
        chemistry = new ArrayList<>();
        latin = new ArrayList<>();
    }

    public void setMark(Disciplines discipline, Number t) {
        if (discipline.equals(Disciplines.BIOLOGY))
            biology.add((Integer) t);
        if (discipline.equals(Disciplines.CHEMISTRY))
            chemistry.add((Integer) t);
        if (discipline.equals(Disciplines.LATIN))
            latin.add((Double) t);
    }

    @Override
    public String subjectMark(Disciplines discipline) {

        if (discipline.equals(Disciplines.BIOLOGY))
            return "mathematics=" + biology;
        if (discipline.equals(Disciplines.CHEMISTRY))
            return "phisics=" + chemistry;
        if (discipline.equals(Disciplines.LATIN))
            return "computerScience=" + latin;
        return null;
    }

    @Override
    public String allMarks() {
        return toString();
    }

    @Override
    public void clear() {
        biology.clear();
        chemistry.clear();
        latin.clear();
    }


    @Override
    public String toString() {
        return "BiologyGroup{" +
                "biology=" + biology +
                ", chemistry=" + chemistry +
                ", latin=" + latin +
                '}';
    }
}
