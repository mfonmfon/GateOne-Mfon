
import java.util.Scanner;
import java.util.ArrayList;

public class CreditCardValidator {

    public static void main(String[] args) {

        Scanner validator = new Scanner(System.in);

        int[] cardId = new int[16];
        System.out.println("Welcome to Semicolon,  please follow the instructions to validate your card");

        System.out.println("Hello, Kindly enter your card details to verify your card");
        String creditCard = validator.next();

        if (creditCard.charAt(0) == '4') {
            System.out.println("Credit card type: Visa Cards");
            System.out.println("Credit card number: " + creditCard);
            System.out.println("Credit card digit length: " + creditCard.length());

        } else if (creditCard.charAt(0) == '5') {
            System.out.println("Credit card type: Master Cards");
            System.out.println("Credit card number: " + creditCard);
            System.out.println("Credit card digit length: " + creditCard.length());

        } else if (creditCard.charAt(0) == '3') {
            System.out.println("Credit card type: American Express");
            System.out.println("Credit card number: " + creditCard);
            System.out.println("Credit card digit length: " + creditCard.length());
        } else if (creditCard.charAt(0) == '6') {
            System.out.println("Credit card type: Discover");
            System.out.println("Credit card number: " + creditCard);
            System.out.println("Credit card digit length: " + creditCard.length());
        }

        else {
            while (true) {
                System.out.println("Credit card type: Invalid");
                System.out.println("Credit card number: " + creditCard);
                System.out.println("Credit card digit length: " + creditCard.length());
                System.out.println("Credit card validity status: Invalid");

            }

        }

        if (creditCard.length() < 16) {
            System.out.println("Credit card type: Invalid card");
            System.out.println("Credit card type: " + creditCard);
            System.out.println("Please enter a valid card number");
            System.out.println("Credit card validity status: Invalid");

        }

    }

}
