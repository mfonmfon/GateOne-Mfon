import java.util.Scanner;
import java.util.Arrays;

public class TaskOne{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);
	

	char[][] numbers = new char [3][3];
	int userInput = 0;

	for(int index = 0; index < numbers.length; index++){
		for(int indexTwo = 0; indexTwo < numbers.length; indexTwo++){
			System.out.print("Play this game by entering x and 0:   ");
			numbers[index][indexTwo] =  scan.next().charAt(0);

			if(numbers.equals(0) || numbers.equals("x")){
				
			}
			
		}
		
	}

		for(int counter = 0; counter < numbers.length; counter++){
			for(int counterTwo = 0; counterTwo < numbers.length; counterTwo++){
				System.out.println(Arrays.deepToString(numbers[counter][counterTwo]));

			}
			System.out.println();

		}
		
		System.out.println();

}


}