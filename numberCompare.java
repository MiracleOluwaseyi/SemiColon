package ExcerciseThree;

import java.util.Scanner;

public class numberCompare {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int smallest;
        int largest;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number:");
        num1 = input.nextInt();

        System.out.println("Enter second Number: ");
        num2 = input.nextInt();

        System.out.println("Enter third Number: ");
        num3 = input.nextInt();

        System.out.println("Enter fourth Number: ");
        num4 = input.nextInt();

        System.out.println("Enter fifth Number: ");
        num5 = input.nextInt();

        smallest = num1;
        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = 3;
        if (num4 < smallest)
            smallest = 4;
        if (num5 < smallest)
            smallest = 5;

        largest = num1;
                if (num2 > largest)
                    largest = 2;
                if (num3 > largest)
                    largest = 3;
                if (num4 > largest)
                    largest = 4;
                if (num5 > largest)
                    largest = 5;

        System.out.printf("Smallest integer is: %d%n", smallest);
        System.out.printf("Largest Numner is: %d%n", largest);
          }
}
