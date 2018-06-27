package OOP.task3_4.heirarchy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BegginnerSet {

    private List<Stationary> staff;

    public BegginnerSet() {
        staff = new ArrayList<>();
        staff.add(new Pen());
        staff.add(new Paper());
        staff.add(new NoteBook());
    }

    public BegginnerSet(List<Stationary> staff) {
        this.staff = staff;
    }

    public boolean add(Stationary stationary) {
        return staff.add(stationary);
    }

    public boolean remove(Object o) {
        return staff.remove(o);
    }

    public void sortByName() {
        Collections.sort(staff, Comparator.comparing(Stationary::name));
    }

    public void sortByPrice() {
        Collections.sort(staff, Comparator.comparingDouble(Stationary::price));
    }

    public void sort() {
        Collections.sort(staff, (o1, o2) -> {
            int t = o1.name().compareTo(o2.name());
            if (t != 0)
                return t;
            return Double.compare(o1.price(), o2.price());
        });
    }

    @Override
    public String toString() {
        return "BegginnerSet{" +
                "staff=" + staff +
                '}';
    }

}
