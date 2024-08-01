package com.gopi.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Loan")
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	
	@Column
	private String loanAmount;
	
	@Column
	private String loanName;
	
	@Column
	private String principalAmount;
	
	@Column
	private String interestAmount;

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(int loanId, String loanAmount, String loanName, String principalAmount, String interestAmount) {
		super();
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.loanName = loanName;
		this.principalAmount = principalAmount;
		this.interestAmount = interestAmount;
	}

	public int getLoanId() {
		return loanId;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public String getLoanName() {
		return loanName;
	}

	public String getPrincipalAmount() {
		return principalAmount;
	}

	public String getInterestAmount() {
		return interestAmount;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public void setPrincipalAmount(String principalAmount) {
		this.principalAmount = principalAmount;
	}

	public void setInterestAmount(String interestAmount) {
		this.interestAmount = interestAmount;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanAmount=" + loanAmount + ", loanName=" + loanName + ", principalAmount="
				+ principalAmount + ", interestAmount=" + interestAmount + "]";
	}
	
	
}
