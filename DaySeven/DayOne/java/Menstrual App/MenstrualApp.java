import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class MenstrualApp{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
	//cycleLength;
	//beginningOfPeriod;

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
	String questions = scan.next();
		while(true){

		System.out.println("This is  one of the symthoms that tells that your period is aproaching!");
		System.out.println();

		System.out.println("Enter your first name and last name: ");
		userName = scan.next();
		System.out.println();
		System.out.print("Enter the first day you saw your period using the format (DD-MM-YYYY): ");
		String beginningOfPeriod = scan.next();

		//if(beginning == "dd/MM/yyyy"){
			//System.out.println("");

		//}

		System.out.println();
		System.out.print("What is your average ovulution cycle length:  ");
		int cycleLength = scan.nextInt();
		int ovulation = 14;


		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse( beginningOfPeriod, dateFormat);
		LocalDate  expected = date.plusDays(cycleLength);

		int fertile = 5;
		int safeDate = 5;		

		LocalDate ovo = expected.minusDays(ovulation);
		LocalDate fertility = ovo.minusDays(fertile);
		LocalDate safePeriod = fertility.plusDays(safeDate);
	
		System.out.println("_____________________________________________________________________________________");
		System.out.println(".....................................................................................");
		System.out.println("Hello " + userName + "," + " your next menstruation will start  on the " + expected.format(dateFormat) + "i would advice you run away from any man if you dont want to get pregnant soon");
		System.out.println();
		System.out.println("Your Ovulation period is " + ovo);
		System.out.println();
		System.out.println("You fertility period is " + fertile);
		System.out.println("your safe period  is " + safeDate + "\nDo quick and find man ");
		System.out.println("____________________________________________________________________________________");
		System.out.println(".....................................................................................");
		System.out.println();
		break;

		}

		if(questions.equals(false)){
			System.out.println("Hey beautiful, Looks like you typed the wrong input,\ntake a depth breathe! Dont worry you are not pregnant yet...");
			System.out.println();
			

		}
		
		}

	
	}


}


