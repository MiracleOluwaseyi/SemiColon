package Semicolon.Africa;

import java.util.Scanner;

public class Kata {

        Scanner input = new Scanner(System.in);
        public double calculateAverage (double firstNumber, double secondNumber, double thirdNumber){
            double result =0.0;
            result = (firstNumber + secondNumber + thirdNumber) / 3.00;
            return result;
        }


        public String calculateGrade ( double score){

            System.out.print("Enter your Score: ");
            score = input.nextDouble();

            if (score >= 0 && score <= 100) {
                if (score >= 90) {
                    return "Your Grade is A(Excellent)";
                } else if (score >= 80) {
                    return "Your Grade is B+(Very Good)";
                } else if (score >= 70) {
                    return "Your Grade is B(Good)";
                }
                else if (score >= 60) {
                    return "Your Grade is C(Put more Effort)";
                }
                    else if (score >= 50) {
                    return "Your Grade is D(Read & Pray)";
                }
                        else if (score >= 40){
                     return "Your Grade is E(Get back to work)";
                }
                else {
                    return "Sorry You Fail(Don't Give up!)";
                }
            } else {
                return "Ode Invalid Input";
            }
        }

    }

