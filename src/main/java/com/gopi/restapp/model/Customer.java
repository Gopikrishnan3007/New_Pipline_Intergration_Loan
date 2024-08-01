package com.gopi.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	@Column
	private String customerName;

	@Column
	private String customerAddress;
	
	@Column
	private String customerMobileNo;

	@Column
	private String date;
	
	@Column
	private String accountNumber;
	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loan")
	private Loan loan;


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(int customerId, String customerName, String customerAddress, String customerMobileNo, String date,
			String accountNumber, Loan loan) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerMobileNo = customerMobileNo;
		this.date = date;
		this.accountNumber = accountNumber;
		this.loan = loan;
	}


	public int getCustomerId() {
		return customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public String getCustomerMobileNo() {
		return customerMobileNo;
	}


	public String getDate() {
		return date;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public Loan getLoan() {
		return loan;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public void setLoan(Loan loan) {
		this.loan = loan;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerMobileNo=" + customerMobileNo + ", date=" + date + ", accountNumber="
				+ accountNumber + ", loan=" + loan + "]";
	}
	
	
}
