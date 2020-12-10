package auto.boxing.challenge;

import java.util.ArrayList;

public class Customer {
	private String customerName;
	private ArrayList<Double> transactionList= new ArrayList<>();
	private Double depositAmount;
	public Double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ArrayList<Double> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(ArrayList<Double> transactionAmount) {
	
		this.transactionList = transactionAmount;
		
	}
	
	public Customer(String customerName) {
		this.customerName = customerName;
		//this.transactionList = ;
		
	}
	
	public Customer(Customer customer) {
		this.customerName = customer.getCustomerName();
		this.transactionList = customer.getTransactionList();
		
	}
	public static Customer getCustomer(String customerName, double initialDeposit) {
		Customer customer = new Customer(customerName);
		customer.setCustomerName(customerName);
        customer.getTransactionList().add(initialDeposit);
		return customer;
		
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", transactionList=" + transactionList + ", depositAmount="
				+ depositAmount + "]";
	}

}
