import java.util.Scanner;

public class TaskTen{
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
		average = sum / scores;
		
		
	
	
	}
	else{
	System.out.println("invalid");

	}
	
	
	}
	System.out.println("valid sum is " + sum);
	System.out.println("the average scores is " + average);
}


}