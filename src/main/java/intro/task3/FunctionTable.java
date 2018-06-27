package intro.task3;

import static java.lang.Math.tan;

public class FunctionTable {

    private int start;
    private int end;
    private int step;

    public FunctionTable(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    private double calculate(int param) {
        return tan(2 * param) - 3;
    }

    private int[] makeArray (){
        int[] value = new int[(end-start)/step+1];
        int param = 0;
        for (int i = start; i <= end; i = i + step) {
            value[param++] =  i;

        }
        return value;
    }

    private double[] calculateAll() {
        double[] value = new double[(end-start)/step+1];
        int param = 0;
        for (int i :makeArray()) {
            value[param++] =  tan(2 * i) - 3;

        }
        return value;
    }

    public void printTable() {
        int[] steps = makeArray();
        double[] values = calculateAll();
        for (int i = 0; i<steps.length;i++) {
            System.out.print(steps[i] + "    ");
            System.out.println(values[i]);
        }
    }
}
