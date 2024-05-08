import java.util.Scanner;

public class TaskEight{
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);


	int scores = 0;
	int sum = 0;
	int index = 0;
	double average = 0;
	for(; index < 10; index++){
	System.out.print("Enter a number");
	scores = scan.nextInt();

	if(scores <= 100 || scores == 0){

		sum += scores;
		System.out.println("This is a valid scores");
		
	
		
	
	
	}
	else{
	System.out.println("invalid");

	}
	
	
	}
	System.out.println("The sum is: " + sum);
}


}