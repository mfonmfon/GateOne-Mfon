import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TaskOne{

	public static String getDateOfBirth(String dateOfBirth){
		
	int age = 0;
	LocalDate date = LocalDate.parse(dateOfBirth, date);

	age = dateOfBirth - date;

	return age;

	}
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);


	System.out.println("Enter your date of birth");
	String dateOfBirth = scan.next();

	int age = 0;

	LocalDate currentDate = LocalDate.now();

	int convertToString = parse(dateOfBirth, currentDate);


	age = dateOfBirth - currentDate ;

	System.out.println(age);

	
	}

}