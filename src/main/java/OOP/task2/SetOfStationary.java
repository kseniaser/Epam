package OOP.task2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetOfStationary {

    private Set<Stationary> stationary;//= new HashSet<>();

    public SetOfStationary(Set<Stationary> stationary) {
        this.stationary = stationary;
    }

    public SetOfStationary() {
        Set<Stationary> n3 = new HashSet<>();
        n3.add(new Stationary(Tool.PEN, 1, 50));
        this.stationary = n3;
    }

    public Set<Stationary> getStationary() {
        return stationary;
    }

    public void setStationary(Set<Stationary> stationary) {
        this.stationary = stationary;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Stationary s : stationary) {
            sum += s.getTotalPrice();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        final SetOfStationary setOfStationary;
        return o == this
                || o instanceof SetOfStationary
                && (setOfStationary = (SetOfStationary) o).canEqual(this)
                && Objects.equals(stationary, this.stationary);
    }

    private boolean canEqual(Object other) {
        return other instanceof SetOfStationary;
    }


    @Override
    public int hashCode() {
        return Objects.hash(stationary);
    }

    @Override
    public String toString() {
        return "{" +
                "stationaries=" + stationary +
                '}';
    }
}
