

import java.util.Scanner;
import java.util.Arrays;
public class TaskOne{

	
	public static int[] getScores(int[] numbers ){
		Scanner scan = new Scanner(System.in);

		int[] scores = new int[10];
		int index = 0;
		for(; index < numbers.length; index++){

		System.out.println("Enter scores");
		scores[index] =  scan.nextInt();

		
		}

		
		return numbers;
		
	
	}
	
	

	public static void main(String... args){
	int[] arrays = {1,2,3,4,5,6,7,8,9,10};
	getScores(arrays);

	
	}

}






























