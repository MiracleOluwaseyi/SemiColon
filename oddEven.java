package Semicolon.Africa;

import java.util.Scanner;

public class oddEven {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        if(number % 2 == 0)
            System.out.printf("%d is even", number);

        if(number % 2 == 1)
         System.out.printf("%d is odd", number);

    }
}
