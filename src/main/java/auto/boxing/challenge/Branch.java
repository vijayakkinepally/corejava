package auto.boxing.challenge;

import java.util.ArrayList;

public class Branch {

	private ArrayList<Customer> customerList = new ArrayList<>();
	private String branchName;
	
	public Branch(String branchName) {
		this.branchName = branchName;
		this.customerList = new ArrayList<>();
	}


	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public static Branch getBranch(String branchName) {
		Branch branch = new Branch(branchName);
		branch.setBranchName(branchName);
		return branch;
	}

	public boolean addCustomer(Customer customer) {
		if (findCustomer(customer) == -1) {
			this.customerList.add(customer);
			return true;
		} 
		return false;

	}

	public boolean depositMoney(Customer customer) {
		int customerIndex = findCustomer(customer.getCustomerName());
		if(customerIndex >=0) {
			Customer exstngCustmr =this.customerList.get(customerIndex);
			exstngCustmr.getTransactionList().add(customer.getDepositAmount());
			return true;
		}
		return false;
	}

	public boolean isExistingCustomer(Customer customer) {
		return this.customerList.contains(customer);
	}

	public int findCustomer(Customer customer) {
		return this.customerList.indexOf(customer);
	}

	public int findCustomer(String customerName) {
		for(int i=0; i< this.customerList.size();i++) {
			
			Customer customer = this.customerList.get(i);
			if(customer.getCustomerName().equalsIgnoreCase(customerName)) {
				return i;
			}
		}
		return -1;
	}

}
