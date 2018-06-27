package intro.task4;

import static java.lang.Double.MIN_VALUE;

public class MaxValue {
    private double[] array;

    public MaxValue(double[] array) {
        this.array = array;
    }

    private double findMax() {
        double prev = MIN_VALUE;
        double max = MIN_VALUE;
        for (double i : array) {
            if (prev + i > max) {
                max = prev + i;
            }
            prev = i;
        }
        return max;
    }

    public void printMax (){
        System.out.print(findMax());
    }
}

