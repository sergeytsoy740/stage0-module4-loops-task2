package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        //Write a program that will write to console multiplied numbers
        //by input from zero to the number from method arguments using while loop,
        //each on new line(program should also be able to work with negatives):
        int i = 0;
        if (multiplyByAndToInclusive > -1) {
            while (i <= multiplyByAndToInclusive) {
                System.out.println(multiplyByAndToInclusive * i);
                i++;
            }
        } else {
            while (i <= -multiplyByAndToInclusive) {
                System.out.println(multiplyByAndToInclusive * i);
                i++;
            }
        }
    }
}
