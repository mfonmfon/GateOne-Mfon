import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class MenstrualApp{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);

	//int cycleLength = 35;

	System.out.println("Welcome to MyChekker healthcare, ");
	System.out.println();
	System.out.println("We are on a mission to improve the well-being of all women");
	System.out.println(""" 

	Your data is very secure with us here
	
	1. -> signUp

	2. -> Login
	
	""");
	int option = scan.nextInt();
	switch(option){

	case 1: 
		System.out.println("Enter your name: ");
		String userName = scan.next();

		System.out.print("How old are you? ");
		int userAge = scan.nextInt();
		if(userAge < 12){
			System.out.println("Opoos!! The age you entered is below the normal age we expect for adults check the programme again  or This menstrual app can only be checked for those only from the age 12 ");
			break;
		}
		else{
			System.out.println("Hello " + userName + "," + " welcome to MyChekker healthcare where you can keep track of your period. Trust us all you informations are safe and private with us.");
			

		}
		
	case 2: 
	System.out.println("Answer the following questions to calculate when next your period will come");
	System.out.println();
	System.out.println();
	
	System.out.println("What are the signs of your period coming");
	
	System.out.println("""
__________________________________________________________
..........................................................
	1. Tender breasts

	2. Acne-prone skin

	3. Menstrual cramps

	4. Mood swings

	5. Feeling bloated

	6. Feeling very tired

	7. Dry discharge
___________________________________________________________
...........................................................
	 """);

	System.out.println("Select the options above ");
	int questions = scan.nextInt();

	switch(questions){
	case 1:

		System.out.println(" Tender breasts is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("Enter the first day you saw your period using the format (DD-MM-YY)");
		String beginningOfPeriod = scan.next();

		System.out.print("What is your average ovolution cycle length:  ");
		int cycleLength = scan.nextInt();

		int lengthOfOvulation = 14;

		LocalDate date = LocalDate.parse(beginningOfPeriod);

		LocalDate lengthOfTheCycle = LocalDate.plusDays(cycleLength);

		System.out.println(lengthOfTheCycle);
		


		
		
	case 2:
		System.out.println("Acne-prone skin is a one of the symthoms that tells that your period is aproaching");

		System.out.print("Enter the first day of the last day you saw your period using the format (DD-MM-YY): ");
		beginningOfPeriod = scan.next();

		System.out.print("How Long is your average cycle:  ");
		cycleLength = scan.nextInt();

		break;

	case 3:
		System.out.println("Menstrual cramps is a one of the symthoms that tells that your period is aproaching ");

		System.out.print("Enter the first day of the last day your saw your period using the format (DD-MM-YY) ");
		beginningOfPeriod = scan.next();


		System.out.print("How Long is your average cycle: ");
		cycleLength = scan.nextInt();

		


	case 4:
		System.out.println("Mood swings is a one of the symthoms that tells that your period is aproaching");

		System.out.print("Enter the first day of the last day you saw your period using the format (DD-MM-YY) ");
		beginningOfPeriod = scan.next();


		System.out.print("How Long is your average cycle:  ");
		cycleLength = scan.nextInt();

		
		break;


	case 5:
		System.out.println("Feeling bloated is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("Enter the first day of the last day you saw your period using the format (DD-MM-YY) ");
		beginningOfPeriod = scan.next();


		System.out.print("How Long is your average cycle:  ");
		cycleLength = scan.nextInt();

		
		break;

	case 6:
		System.out.println("Feeling very tired is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("Enter the first day of the last day your saw your period using the format (DD-MM-YY) ");
		beginningOfPeriod = scan.next();


		System.out.print("How Long is your average cycle:  ");
		cycleLength = scan.nextInt();

		

		break;

	case 7:
		System.out.println("Dry discharge is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("Enter the first day of the last day you saw your period using the format (DD-MM-YY)  ");
		beginningOfPeriod = scan.next();

		System.out.print("How Long is your average cycle: ");
		cycleLength = scan.nextInt();
		
		break;

	default:
		System.out.println("Oops!! you entered the wrong input...");

	
	}

	}

	
	

	
	}


}


