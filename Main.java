import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Bank bank = new Bank();
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("=== Welcome to the Banking System ===");

		        while (true) {
		            System.out.print("\nEnter Account Number: ");
		            int accNum = scanner.nextInt();

		            System.out.print("Enter PIN: ");
		            int pin = scanner.nextInt();

		            BankAccount account = bank.findAccount(accNum, pin);

		            if (account != null) {
		                System.out.println("Login successful!");
		                bank.performTransaction(account);
		                break; // exit after user chooses exit
		            } else {
		                System.out.println("Invalid account number or PIN. Try again.");
		            }
		        }

		        scanner.close();
		    }
		}

