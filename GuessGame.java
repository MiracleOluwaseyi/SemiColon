package Practice;

import java.util.Scanner;
public class GuessGame{

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        int numberToGuess = 46;
        int userGuess;

        System.out.println("You are Welcome to Guess Game!!!");
        System.out.println("Enter number to Guess: ");
        userGuess = userInput.nextInt();

        if(userGuess == numberToGuess){
            System.out.println("Well done you guess right");
            System.out.println("You Won!!!");
        }

        if(userGuess < numberToGuess){
            System.out.println("Your guess is lesser than the number");
            System.out.println("Try Again!!!");
        }

        if(userGuess > numberToGuess){
            System.out.println("Your guess is greater than the number");
            System.out.println("Try Again!!!");
        }


    }
}

