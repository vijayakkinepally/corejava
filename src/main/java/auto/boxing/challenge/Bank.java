package auto.boxing.challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
	
	private String bankName;
	private  ArrayList<Branch> branchList = new ArrayList<>();;
	
	public Bank(String bankName) {
		this.bankName = bankName;
		//this.branchList = 
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public ArrayList<Branch> getBranchList() {
		return branchList;
	}
	public void setBranchList(ArrayList<Branch> branch) {
		this.branchList = branch;
	}
	
	public boolean addBranch(String branchName) {
		if(findBranch(branchName) == -1) {
			this.branchList.add(Branch.getBranch(branchName));
			return true;
		}
		return false;
	}
	
	public boolean adddCustomer(String branchName, Customer customer) {
		int index = findBranch(branchName);
		if( index >= 0) {
			Branch branch = this.branchList.get(index);
			branch.addCustomer(customer);
			return true;
		}
		System.out.println("Branch does not exists. Please enter a valid branch");
		return false;
	}
	
	public boolean depositMoney(String branchName, Customer customer) {
		int index = findBranch(branchName);
		if( index >= 0) {
			Branch branch = this.branchList.get(index);
			branch.depositMoney(customer);
			return true;
		}
		return false;
	}
	
	public int findBranch(String branchName) {
		for(int i=0; i< this.branchList.size();i++) {
			
			Branch branch = this.branchList.get(i);
			if(branch.getBranchName().equalsIgnoreCase(branchName)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean getBranchCustomersList(String branchName) {
		int index = findBranch(branchName);
		if(index >=0) {
			Branch branch = this.branchList.get(index);
			System.out.println("Customers List " +Arrays.asList(branch.getCustomerList()).toString());
			return true;
		}
		return false;
	}
	
	public boolean getBranchCustomersList(String branchName, boolean getTransactionalAmount) {
		int index = findBranch(branchName);
		if(index >=0) {
			Branch branch = this.branchList.get(index);
			for(Customer customer: branch.getCustomerList()) {
				System.out.println("Customer Name" +customer.getCustomerName());
				System.out.println("Customer Transaction List" + Arrays.toString(customer.getTransactionList().toArray()));
			}
			
			return true;
		}
		return false;
	}
	
	

}
