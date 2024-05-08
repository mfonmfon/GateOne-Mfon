import java.util.Scanner;
public class TaskFour{
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
	
	int scores = 0;
	int index = 0;
	for(; index < 10; index++){
	System.out.print("Enter a number");
	scores = scan.nextInt();

		if(index % 2 == 0){

			System.out.println(index);

		}

	}
	
	
	
}
	


}