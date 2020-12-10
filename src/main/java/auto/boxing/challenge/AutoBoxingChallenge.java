package auto.boxing.challenge;

import java.util.Scanner;

public class AutoBoxingChallenge {

	private static Scanner scanner = new Scanner(System.in);
	private static Bank bank = new Bank("Chase");

	public static void main(String[] args) {
		boolean quitProgram = false;

		
		printAvailableOptions();
		
		while (!quitProgram) {
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			switch (choice) {
			case 0:
				quitProgram = true;
				break;
			case 1:
				addBranch();
				break;
			case 2:
				addCustomer();
				break;
			case 3:
				depositAmount();
				break;
			case 4:
				getCustomerList();
				break;
			case 5:
				getCustomersListWithTransactions();
				break;
			case 6:
				printAvailableOptions();
				break;
			default:
				printAvailableOptions();
				break;
			}

		}

	}

	private static void printAvailableOptions() {
		System.out.println("Welcome , Available options");
		System.out.println(" 0: quit" + "\n 1:Add Branch" + "\n 2:Add Customer" + "\n 3:Deposit Amount"
				+ "\n 4:Get Customers List" + "\n 5:Get Customers list with transactions"
						+ "\n 6:Print Available options");
		
	}

	private static void getCustomersListWithTransactions() {
		System.out.println("Enter the name of the branch");
		String branchName = scanner.next();
		if(!bank.getBranchCustomersList(branchName, true)) {
			System.out.println("Error occurred while fetching deposit info");
		}
	}

	private static void getCustomerList() {
		System.out.println("Enter the name of the branch");
		String branchName = scanner.next();
		if(!bank.getBranchCustomersList(branchName)) {
			System.out.println("Error occurred while fetching deposit info");
		}
	}

	private static void depositAmount() {
		System.out.println("Enter the name of the branch");
		String branchName = scanner.next();
		System.out.println("Enter customer name");
		String customerName = scanner.next();
		System.out.println("Enter  deposit amount");
		Double depositAmount = scanner.nextDouble();
		Customer customer = Customer.getCustomer(customerName, 0.0);
		customer.setDepositAmount(depositAmount);
		if(bank.depositMoney(branchName, customer)) {
			System.out.println("Customer "+customerName+ " deposit completed");
		}else {
			System.out.println("Error Customer "+customerName+ " deposit not completed");
		}
		
	}

	private static void addCustomer() {
		System.out.println("Enter the name of the branch");
		String branchName = scanner.next();
		System.out.println("Enter customer name");
		String customerName = scanner.next();
		System.out.println("Enter intial deposit amount");
		Double initialDeposit = scanner.nextDouble();
		Customer customer = Customer.getCustomer(customerName, initialDeposit);
		if(bank.adddCustomer(branchName, customer)) {
			System.out.println("Customer "+customerName+ " added succesfully");
		}else {
			System.out.println("Error Customer "+customerName+ " not added");
		}
		
	}

	private static void addBranch() {
		System.out.println("Enter the name of the branch");
		
		String branchName = scanner.next();
		if(bank.addBranch(branchName)) {
			System.out.println("Branch "+branchName+" Added succesfully");
		}else {
			System.out.println("Branch "+branchName+" not added ");
		}
		
	}

}
