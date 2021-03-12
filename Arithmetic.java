package ExerciseTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in);

        double number1;
        double number2;
        int sum;
        int sub;
        int divide;
        int multipy;
        System.out.println("Enter first number: ");
        number1 = input.nextDouble();

        System.out.println("Enter second number: ");
        number2 = input.nextDouble();
        input.close();

        sum = (int) (number1 + number2);
        sub = (int) (number1 - number2);
        divide = (int) (number1/number2);
        multipy = (int) (number1*number2);

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Sub is %d%n", sub);
        System.out.printf("Divide is %d%n", divide);
        System.out.printf("Multiply is %d%n", multipy);

    }
}
