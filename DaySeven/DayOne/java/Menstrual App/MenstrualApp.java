import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualApp{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
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
			System.out.println("Opoos!! The age you entered is below the normal age we expect for adults check the programme again  or\n This menstrual app can only be checked for those only from the age 12 ");

		}




				System.out.println("Hello " + userName + "," + "welcome to MyChekker healthcare where you can keep track of your period.\nTrust us all you informations are safe and private with us. ");


		
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
		System.out.println("This is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("When did your last period start: ");
		String beginningOfPeriod = scan.next();

		System.out.print("How many days did it last: ");
		int durationOfThePeriod = scan.nextInt();

		System.out.print("What is the average length of the menstruation: ");
		int cycleLength = scan.nextInt();

		//LocalDate date = LocalDate.now();
		break;
		
	case 2:
		System.out.println("This is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("When did your last period start: ");
		beginningOfPeriod = scan.next();

		System.out.print("How many days did it last: ");
		durationOfThePeriod = scan.nextInt();

		System.out.print("What is the average length of the menstruation: ");
		cycleLength = scan.nextInt();
		break;

	case 3:
		System.out.println("This is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("When did your last period start: ");
		beginningOfPeriod = scan.next();

		System.out.print("How many days did it last: ");
		durationOfThePeriod = scan.nextInt();

		System.out.print("What is the average length of the menstruation: ");
		cycleLength = scan.nextInt();

	case 4:
		System.out.println("This is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("When did your last period start: ");
		beginningOfPeriod = scan.next();

		System.out.print("How many days did it last: ");
		durationOfThePeriod = scan.nextInt();

		System.out.print("What is the average length of the menstruation: ");
		cycleLength = scan.nextInt();
		break;


	case 5:
		System.out.println("This is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("When did your last period start: ");
		beginningOfPeriod = scan.next();

		System.out.print("How many days did it last: ");
		durationOfThePeriod = scan.nextInt();

		System.out.print("What is the average length of the menstruation: ");
		cycleLength = scan.nextInt();
		break;

	case 6:
		System.out.println("This is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("When did your last period start: ");
		beginningOfPeriod = scan.next();

		System.out.print("How many days did it last: ");
		durationOfThePeriod = scan.nextInt();

		System.out.print("What is the average length of the menstruation: ");
		cycleLength = scan.nextInt();
		break;

	case 7:
		System.out.println("This is a one of the symthoms that tells that your period is aproaching!");

		System.out.print("When did your last period start: ");
		beginningOfPeriod = scan.next();

		System.out.print("How many days did it last: ");
		durationOfThePeriod = scan.nextInt();

		System.out.print("What is the average length of the menstruation: ");
		cycleLength = scan.nextInt();

	default:
		System.out.println("Oops!! you entered the wrong input...");



	

	
	
	}

	}
	

	
	}


}


