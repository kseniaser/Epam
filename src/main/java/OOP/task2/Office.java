package OOP.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Office {

    private static HashMap<String, SetOfStationary> office;

    public static HashMap<String, SetOfStationary> office() {
        return office;
    }

    public static double getTotalPrice() {
        double sum = 0;
        for (SetOfStationary setOfStationary : office.values()) {
            sum += setOfStationary.getTotalPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "{" +
                office().toString() +
                '}';
    }

    public static void main(String[] args) {
        Stationary n1 = new Stationary(Tool.ERASER, 5, 87);
        Stationary n2 = new Stationary(Tool.FOLDER, 8, 21);
        Stationary n3 = new Stationary(Tool.ERASER, 6, 87);
        Stationary n4 = new Stationary(Tool.FOLDER, 8, 90.1);
        Set<Stationary> st = new HashSet<>();
        Set<Stationary> st1 = new HashSet<>();
        st.add(n1);
        st.add(n2);
        st1.add(n3);
        st1.add(n4);
        SetOfStationary John = new SetOfStationary(st);
        SetOfStationary John1 = new SetOfStationary(st1);
        office = new HashMap<>();
        office().put("hi", John);
        office().put("hi1", John1);
        System.out.println(office.toString());
        System.out.println(getTotalPrice());
    }


}
