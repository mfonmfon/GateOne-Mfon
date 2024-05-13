import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualApp{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to MyChekker helathcare, ");
	String option = """ 
	Your data is very secure with us here
	
	1. -> signUp
	2. -> Login
	
	""";
	switch(option){

	case "signUp": 
		System.out.println("signUp");
	case  "Login": 
		System.out.println("Login");
	}
	System.out.println(option);
	System.out.println("Enter your name: ");
	String userName = scan.next();

	System.out.print("How old are you? ");
	int userAge = scan.nextInt();
	if(userAge < 12){
		System.out.println("Opoos!! The age you entered is below the normal age we expect for adults check the programme again  or\n This menstrual app can only be checked for those only from the age 12 ");

	}
	else{
	System.out.println("Answer the following questions to calculate when next your period will come");
	System.out.println();
	System.out.println();
	
	System.out.println("When was the first day of the last day you had your period : ");
	int beginningOfPeriod = scan.nextInt();

	System.out.println("How long did the period last");
	int durationOfThePeriod = scan.nextInt();

	int cycleDate = beginningOfPeriod - durationOfThePeriod;
	System.out.println(" Hello " + userName + " the period last for: " + cycleDate);

	}
	

	
	}




}