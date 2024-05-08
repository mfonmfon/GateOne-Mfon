import java.util.Scanner;
import java.util.Random;

public class TaskOne{
	public static void main(String... args){
	
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);

	int firstNumber = rand.nextInt();
	int secondNumber = rand.nextInt();

	int correct = firstNumber + secondNumber;
	 correct = firstNumber - secondNumber;
	correct = firstNumber * secondNumber;
	correct = firstNumber / secondNumber;
	
	for(int index = 0; index < 10; index++){
	System.out.print("Generate random numbers from 1 - 10 ");
	int studentInput = scan.nextInt();
	
	
	if(correct == firstNumber + secondNumber){
		
		System.out.println("correct");

	}
	else if(correct == firstNumber - secondNumber){
		System.out.println("correct");
	}
	else if("correct == firstNumber * secondNumber");
		System.out.println("correct");
	
	}
	else if(correct == firstNumber / secondNumber){
		System.out.println("correct");

	}
	
	else{
		System.out.println("incorrect");
	}
		System.out.println(userInput);

	
}
	 



}