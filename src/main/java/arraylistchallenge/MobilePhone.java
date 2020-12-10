package arraylistchallenge;

import java.util.ArrayList;

public class MobilePhone {

	private ArrayList<Contact> contactList = new ArrayList<>();

	public ArrayList<Contact> getContactList() {
		return contactList;
	}

	public void addContact(Contact contact) {
		if (findContact(contact.getName()) >=0) {
			System.out.println("Contact " + contact.getName() + " Already exists");
		}
		this.contactList.add(contact);

	}

	public Contact getContact(String name) {
		int index = findContact(name);
		if (index >= 0) {
			return contactList.get(index);
		}
		return null;
	}

	private int getIndex(Contact contacts) {
		 return this.contactList.indexOf(contacts);
	}
	
	private int findContact(String name) {
		 for(int i=0;i<this.contactList.size();i++) {
			 Contact contact = this.contactList.get(i);
			 if(contact.getName().equalsIgnoreCase(name))
				 return i;
		 }
		
		return -1;
	}



	public void updateContact(Contact existinContact, Contact newcontact) {
		
		int currentContactIndex = getIndex(existinContact);
		if (currentContactIndex >=0) {
			contactList.set(currentContactIndex, newcontact);

		} else {
			System.out.println("Contact does not exists.");
		}

	}

	public void removeContact(String name) {
		int currentContactIndex = findContact(name);
		if (currentContactIndex >= 0) {
			contactList.remove(currentContactIndex);
		}
	}

}
