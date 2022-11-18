package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        boolean greatest = first >= second;
        if (greatest) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}
