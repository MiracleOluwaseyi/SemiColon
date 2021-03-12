package ClassExcercise;

import java.util.Scanner;

public class numberFactor {
    public static void main(String [] args){

        System.out.println("Welcome to Factors of NUmber");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int numberFactors;

        System.out.println("The Factors are +number + are");
        for(numberFactors = 1; numberFactors <= number; numberFactors++){
            if (number % numberFactors == 0){
                System.out.println(" " +numberFactors);
            }
        }
    }
}
