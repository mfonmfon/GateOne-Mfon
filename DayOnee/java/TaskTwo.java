import java.util.Scanner;
public class TaskTwo{
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);


	int scores = 0;
	int total = 0;
	double average = 0;
	for(int index = 0; index < 10; index++){
	System.out.print("Enter a number");
	scores = scan.nextInt();

	total = total + scores;
	average =  scores / 10;
	
	

	}
	System.out.println(average);
	System.out.println(total);
	
	

	
	}



}