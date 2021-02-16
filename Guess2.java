import java.util.Scanner;
public class Guess2{

	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);
	
	int numberToGuess = 35;
	
	
	System.out.println("Enter number to Guess: ");
		int userGuess = input.nextInt(); 

	if(userGuess == numberToGuess){
		System.out.println("Well done you guess right");
}

	if(userGuess < numberToGuess){
		System.out.println("Your was lower than the number");
}
	
	if(userGuess > numberToGuess){
		System.out.println("You guess is greater than the number");
}	


}
}
