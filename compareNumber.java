package ExerciseTwo;

import java.util.Scanner;

public class compareNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our World, This application will compare any number given and gives out reply accordingly.");
        double num1;
        double num2;

        System.out.println("Enter first number: ");
        num1 = input.nextDouble();

        System.out.println("Enter second number: ");
        num2 = input.nextDouble();

        if (num1 > num2)
            System.out.printf("%.2f is larger than %.2f%n", num1, num2);

        if (num1 < num2)
            System.out.printf("%.2f is lesser than %.2f%n", num1, num2);

       if  (num1 == num2)
        System.out.print("These numbers are Equal");

    }
}
