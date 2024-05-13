import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class chekOutApp{


	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
	
	ArrayList<String> items = new ArrayList<String>();
	ArrayList<Integer> amount = new ArrayList<Integer>();
	ArrayList<Double> sales = new ArrayList<Double>();
	ArrayList<Double> sum = new ArrayList<Double>();
	
		
	double discount = 0;
	double total = 0;
	double vat = 0;
	Integer quantity = 0;
	String boughtItems = null;
	double price = 0;
	double subTotal = 0;
	
	System.out.println("WELCOME TO SEMICOLON ");

	System.out.println("What is the  customer name: ");
	String customerName = scan.nextLine();

	String userReply = "";
	Date date = new Date();

	do{

		System.out.println("What did the user buy: ");
		boughtItems = scan.next();
		
		System.out.println("How many Pieces: ");
		quantity = scan.nextInt();
		
		System.out.println("How much per unit: ");
		price = scan.nextDouble();

		System.out.println("Add more items: ");
		userReply = scan.next();

	}while(!userReply.equals("no"));

			System.out.println("What is your name (cashier Name: )");
			String cashierName = scan.next();

			System.out.println("How much discount will he get? ");
			 discount = scan.nextDouble();

			
				
				System.out.println("SEMICOLON STORES");
				System.out.println("MAIN BRANCH ");
				System.out.println("LOCATION: " + "HERBERT MACAULY WAY, SABO YABA, LAGOS.");
				System.out.println("TEL: 03293828343");
				System.out.println("Date: " + date);
				System.out.println("Cashier: " + cashierName);
				System.out.println("==============================================================");


				System.out.println("               ITEM \t QTY \t PRICE    \t   TOTAL(NGN)");

				System.out.println("--------------------------------------------------------------");
						

						for(int counter = 0; counter < 2; counter++){

							items.add(boughtItems);
							amount.add(quantity);
							sales.add(price);
							sum.add(total);

							total = quantity * price;

							subTotal += subTotal + 1;

							subTotal = discount + vat / 100;
							
							
							
					
							

						}
							
							System.out.printf("  \t      " +   boughtItems + "  \t  " + quantity + " \t " + price  +    "   \t  " + total);
									
							
							System.out.println("--------------------------------------------------------------");

							System.out.println("subTotal: " +  total);
							System.out.println("Discount: " + discount);
							System.out.println("Vat @ 17.50: " + vat);

					
							System.out.println("==============================================================");

							System.out.println("Bill Total: " + total);
							System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + subTotal);

							System.out.println("==============================================================");
							
									
					
						


				

				



	}




}