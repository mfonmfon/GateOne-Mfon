import java.util.Scanner;

public class AtmMachine{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);

	String userPin = "8";
	System.out.println("""

____________________________________________
.............................................

	    BANKE BANK 
____________________________________________
.............................................

	1. Create an account 

	2. Close account

	3. Deposit money

	4. Withdraw money

	5. Check Account Balance

	6. Transfer Money to another account

	7. Change Pin

	""");
	int option = scan.nextInt();
			
	
		
		

		switch(option){
			case 1:
				System.out.println("Open an account to enjoy safe, versatile and convenient banking with Banke Bank");
				System.out.println();
		
				System.out.println("Let's get started with your BVN or NIN\nDial #565*0# to check your Bank Verification Number (BVN)");
				System.out.println();

				System.out.print("Enter your BVN ");
				Long bankVeriNumber = scan.nextLong();

				System.out.print("Enter your Date Of Birth");
				String dateOfBirth = scan.next();

				System.out.print("Enter your NIN");
				Long idNumber = scan.nextLong();

				System.out.println("Let's get started with your Name and pin");

				System.out.println("Enter your first name: ");
				String userFirstName = scan.next();

				System.out.println("Enter your second name: ");
				String userSecondName = scan.next();

				System.out.println("Enter your pin: ");
				userPin = scan.next();

					if(userPin.length() < 8){
						System.out.println("you ATM pin can not be lower than 8");
						break;
					}
					if(userPin.length() > 8){
						System.out.println("Your ATM pin can only have 8 character ");
						break;

					}
					else{
						System.out.println("Hello " + userFirstName + " " + userSecondName + " "  );
						System.out.println("your account  was created successfully>>>>>>>>>");


					}

				}

				


		}
	
	


}