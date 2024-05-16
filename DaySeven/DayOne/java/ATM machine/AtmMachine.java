import java.util.Scanner;
import java.util.Random;
import java.util.UUID; 

public class AtmMachine{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);

	Random rand = new Random();
	int accountNumber = rand.nextInt(1000000000);
	int newUserPin = rand.nextInt(1000);

	//String userResponse = "";
	int totalAmount = 0;
	System.out.println("Select your language preference");
				System.out.println("""
				_____________________________________________________
				..................................................... 
						
						Select Language	
				_____________________________________________________
				.....................................................
					1. Yoruba
					2. Igbo
					3. Ibibio
					4. Hausa
					5. English
				
				""");
				int userLanguage = scan.nextInt();
				switch(userLanguage){
					case 1:
						System.out.println("Sorry! The Yoruba language is not up to date on this machine. ");
						break;
					case 2:
						System.out.println("Sorry! The Igbo language is not up to date on this machine. ");
						break;
					case 3: 
						System.out.println("Sorry! The Ibibio language is not up to date on this machine. ");
						break;
					case 4:
						System.out.println("Sorry! The Hausa language is not up to date on this machine. ");
						break;

					case 5:
						String userPin = "4";
	System.out.println("""
_________________________________________________
|________________________________________________|
|................................................|
|                                                |
|	    	BANKE BANK                       |
|________________________________________________|
|						 |
|						 |
|						 |
|	1. Create an account 			 |
|           	                                 |
|	2. Deposit Money	                 |		
|                                                |
|	3. Check Account Balance                 |
|                                                |
|	4. Transfer	                         |
|                                                |
|	5. Withdraw                              |                 
|                                                |
|	6. Change Pin	                         |
|	                                         |
|	7. Close account                         |
|________________________________________________|

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
				System.out.println();
				System.out.println("Enter your first name: ");
				String userFirstName = scan.next();

				System.out.println("Enter your second name: ");
				String userSecondName = scan.next();

				System.out.println("Enter your pin: ");
				userPin = scan.next();

					if(userPin.length() < 4){
						System.out.println("you ATM pin can not be lower than 8");
						break;
					}
					if(userPin.length() > 4){
						System.out.println("Your ATM pin can only have 8 character ");
						break;
					}
					else{
						System.out.println("Hello " + userFirstName);
						System.out.println("your account  was created successfully>>>>>>>>>");
						System.out.println("Your account number is " + accountNumber);
						System.out.println("Please dont disclose your Banke informations to anyone\nBanke will not call to ask for your secret informations");
					}
					break;

				//This is for deposit
				case 2:
						System.out.println("Enter your pin");
						userPin = scan.next();
						if(userPin.length() > 4){
							System.out.println("Incorrect Pin.\nYour pin must be 4 digit only");	
							break;							
						}
						else if(userPin.length() < 4){
						System.out.println("Incorrec Pin.\nYour pin must be 4 digit only");
						break;
						}
						else{
						}
						System.out.println("How much do you want  to deposit: ");
						int depositMoney = scan.nextInt();
						totalAmount = totalAmount + depositMoney;
						System.out.println("Transaction Successful");
						System.out.println("Credit Alert!!!");
						System.out.println(totalAmount + "Approved");
						break;


//This is the balance feature
				case 3:

					System.out.println("Enter your 4-digit pin");
					userPin = scan.next();
					System.out.print("Enter enquiry");
					int enquiry = scan.nextInt();		
					System.out.print("Your current balance is " + totalAmount);

					break;


//This is the Transfer feature

				case 4:
					System.out.println("Enter your 4 digit Atm pin: ");
					userPin = scan.next();

					if(userPin.length() > 4){
						System.out.println("Incorrec Pin.\nYour pin must be 4 digit only");								
					}
					else if(userPin.length() < 4){
						System.out.println("Incorrec Pin.\nYour pin must be 4 digit only");
								
					}else{
								


						System.out.println("""
									
						____________________________________________________________
 						............................................................
									
									Account Type

						____________________________________________________________
						.............................................................
									1. Savings Account
		
									2. Current Account

								""");
								
							       int transferAccountType = scan.nextInt();
								switch(transferAccountType){
									case 1:
										System.out.println("Enter the amount you want to transfer");
										
										System.out.println(""" 
										1. 1000       4. 10000
										
										2. 2000	      5. 20000
									
										3. 5000	      6. Others

										""");

										int transferAccount = scan.nextInt();

							
										
							System.out.println("Enter bank account: ");
							accountNumber = scan.nextInt();


							System.out.println("Enter the amount you want to transfer: ");
							int transferAmount = scan.nextInt();

							if(transferAmount < totalAmount){
							System.out.println("Insufficient Fund");

							}else{
							System.out.println("Transaction Approved");
							System.out.println("your transfer of " + transferAmount + " was approved"); 
							System.out.println("your main balance is " + (totalAmount + transferAmount));
							}
							break;
											

					case 5:
							System.out.println("Enter your 4 digit ATM pin ");
							userPin = scan.next();

							if(userPin.length() > 4){
								System.out.println("Incorrect Pin.\nYour pin must be 4 digit only");								
							}
							else if(userPin.length() < 4){
								System.out.println("Incorrect Pin.\nYour pin must be 4 digit only");
							}
							else{
	
							
							
								System.out.println("""
									
						____________________________________________________________
 						............................................................
									
									Account Type

						____________________________________________________________
						.............................................................
									1. Savings Account
		
									2. Current Account

								""");
								
							      int  withdrawAccountType = scan.nextInt();
								switch(withdrawAccountType){
									case 1:
										System.out.println("Enter the amount you want to withdraw");
										
										System.out.println(""" 
										1. 1000       4. 10000
										
										2. 2000	      5. 20000
										
										3. 5000	      6. Others

										""");
										

										int withdrawAmount = scan.nextInt();
										switch(withdrawAmount){
									case 1:

										System.out.println("Take Cash");

										System.out.println("Do you want to perform another transaction? ");
										String transact = scan.next();
										break;

									case 2:
										System.out.println("Take Cash");
										break;
									case 3:
										System.out.println("Take Cash");
										break;
									case 4:
										System.out.println("Take Cash");
										break;
									case 5:
										System.out.println("Take Cash");
										break;
									case 6:
										System.out.println("Enter Amount: ");
										int cashAmount = scan.nextInt();

										if(cashAmount > totalAmount){
											System.out.println("Insufficient Fund"); 										

										}
										else{
											cashAmount += 1;
											System.out.println("Transaction successful>>>>>>>>>>>>>>");
											System.out.println();
											System.out.println("Approved");


											System.out.println("Do you want to perform another transaction ");
											String userResponse = scan.next();
											}
										
										
										default:
											System.out.println("Opoos! you've entered the wrong input");
										
										break;
										}

						case 6:
										System.out.println("Enter the old pin: ");
										userPin = scan.next();

										System.out.println("Create a new pin");
										newUserPin = rand.nextInt(1000); 

										System.out.println("New Pin created\nPlease note, do not disclose your pin to anyone, remember Banke bank will not call you for your secrete pin");
										System.out.println();
										System.out.println("You new pin is " + newUserPin);
										break;

						
								
									}
				
								
								}

								}
							
								
							}
						}
					
				
				}
					
				

			}
		}

	


