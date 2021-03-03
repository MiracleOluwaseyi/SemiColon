import java.util.Scanner;

public class Score{

	public static void main(String args []){

	 Scanner input = new Scanner(System.in);

System.out.print("Enter your Score:");
 double Score = input.nextDouble();

if(Score >= 40){
System.out.println("PASSED");
}

if(Score < 40){
System.out.println("FAILED");
}

 }

}
