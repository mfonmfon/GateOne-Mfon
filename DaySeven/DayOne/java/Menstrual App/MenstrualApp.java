import java.util.Scanner;

public class MenstrualApp{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);


	System.out.println("Welcome to MyChekker helathcare, ");
	
	System.out.println("Enter your name: ");
	String userName = scan.next();

	
	System.out.println("Answer the following questions to calculate when next your period will come");
	System.out.println();
	System.out.println();

	System.out.print("How old are you? ");
	int userAge = scan.nextInt();

	if(userAge < 12){
		System.out.println(" this menstrual can only be checked for those only from the age 12");
	}
	


	System.out.println();

	int[] period = new int[35];

	for(int index = 0; index < period.length; index++){

	System.out.println("What month does your menstruation begins: ");
	String beginningOfPeriod = scan.next();

	System.out.print("How many days does your mensrtuation last");
	int checkDate = scan.nextInt();

	}
	

	

	}




}