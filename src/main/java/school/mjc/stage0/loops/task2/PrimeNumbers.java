package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive > 1) {
            for (int n = 2; n <= printToInclusive; n++) {
                int dividers = 0;
                for (int i = 1; i <= printToInclusive; i++) {
                    if (n % i == 0) {
                        dividers++;
                    }
                    if (dividers > 2) {
                        break;
                    }
                }
                if (dividers == 2) System.out.println(n);
            }

        }
    }
}
