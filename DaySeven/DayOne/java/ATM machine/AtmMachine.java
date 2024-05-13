import java.util.Scanner;
public class AtmMachine{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);

	String options = """ 
	
	1. Create an account with their first name, last name and pin

	2. Close account

	3. Deposit money

	4. Withdraw money

	5. Check Account Balance

	6. Transfer Money to another account

	7. Change Pin

	""";


		switch(options){

			case1:
				System.out.println("Create an account");

				System.out.println("Enter your first name: ");
				String firstName = scan.next();

				System.out.println("Enter your second name: ");
				String secondName = scan.next();

				System.out.println("Enter your pin");
				int userPin = scan.nextInt();

				if(userPin.equals(userPin)){
					System.out.println("valid"); 

				}
				System.out.println(options);




		}
	}


}