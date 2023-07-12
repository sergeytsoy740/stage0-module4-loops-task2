package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factor = 1;
        int factorial = 1;
        while (factor < printToInclusive) {
            factorial = ++factor * factorial;
        }
        System.out.println(factorial);

    }
}
