import java.util.Scanner;

public class TaskOne{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);
	
	

	int[][] numbers = new int[3][3];

	int input = 0;

	for(int index = 0; index < numbers.length; index++){

		for(int indexTwo = 0; indexTwo < numbers.length; indexTwo++){

			System.out.print("Play this game by entering x and 0:   ");
			numbers[index][indexTwo] =  scan.next().charAt(0);

			if(numbers.equals(0) || numbers.equals("x")){
				//input = numbers[index][indexTwo];

			}
			
		}
		
	}

		for(int index = 0; index < numbers.length; index++){
			for(int indexTwo = 0; indexTwo < numbers.length; indexTwo++){
				System.out.print(numbers);


			}

		}
		System.out.println();


}


}