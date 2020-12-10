package arraylistchallenge;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListChallenge {

	private static final Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {

		boolean quitProgram = false;
		MobilePhone mobilePhone = new MobilePhone();

		System.out.println("Enter your choice" + "\n" + "0: Quit ");
		System.out.println("1:Add New Contact" + "\n" + "2:Search Contact" + "\n" + "3:Update Contact" + "\n"
				+ "4:Remove Contact" + "\n" + "5:Print list of Contacts");
		while (!quitProgram) {
			int choice = scanner.nextInt();

			
				switch (choice) {

				case 0:
					quitProgram = true;
					break;
				case 1:
					addNewContact(mobilePhone);
					break;

				case 2:
					searchContact(mobilePhone);
					break;

				case 3:
					updateContact(mobilePhone);
					break;

				case 4:
					removeContact(mobilePhone);
					break;

				case 5:
					printListOfContacts(mobilePhone);
					break;
				}
			}
	

	}

	public static void printListOfContacts(MobilePhone mobilePhone) {
		System.out.println(Arrays.toString(mobilePhone.getContactList().toArray()));
	}

	public static void removeContact(MobilePhone mobilePhone) {
		System.out.print("Enter contact name");
		mobilePhone.removeContact(scanner.next());

	}

	public static void updateContact(MobilePhone mobilePhone) {
		System.out.print("Enter current contact name");
		String currentContactName = scanner.next();
		
		Contact oldContact = mobilePhone.getContact(currentContactName);
		
		Contact contact = new Contact();
		System.out.print("Enter new contact name");
		contact.setName(scanner.next());
		System.out.print("Enter new contact phonenum");
		scanner.nextLine();
		contact.setPhoneNumber(scanner.nextInt());
		mobilePhone.updateContact(oldContact, contact);
		

	}

	public static void searchContact(MobilePhone mobilePhone) {
		System.out.println("Enter Name to search:");
		Contact result = mobilePhone.getContact(scanner.next());
		System.out.println("Contact Details: " + result.toString());

	}

	public static void addNewContact(MobilePhone mobilePhone) {
		Contact contact = new Contact();
		System.out.println("Enter Name:");
		contact.setName(scanner.next());
		scanner.nextLine();
		System.out.println("Enter PhoneNum:");
		int phoneNum = scanner.nextInt();
		contact.setPhoneNumber(phoneNum);

		mobilePhone.addContact(contact);

	}

}
