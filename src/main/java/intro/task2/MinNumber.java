package intro.task2;

import static java.lang.StrictMath.pow;

public class MinNumber {

    private double epsilon;

    public MinNumber(double epsilon) {
        this.epsilon = epsilon;
    }

    private int findMin() {
        double param = 1;
        int iter = 1;
        while (param >= epsilon) {
            iter++;
            param = 1 / pow(1 + iter, 2);
        }
        return iter;
    }

    public void printMin(){
        System.out.print(findMin());
    }
}
