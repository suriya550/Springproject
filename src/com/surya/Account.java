package com.surya;

public class Account implements FilterMethods {

	
		
		private int AccountId;
		private String AccountName;
		private float AccountBalance;
		
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Account(int accountId, String accountName, float accountBalance) {
			AccountId = accountId;
			AccountName = accountName;
			AccountBalance = accountBalance;
		}
		
		public int getAccountId() {
			return AccountId;
		}
		public void setAccountId(int accountId) {
			AccountId = accountId;
		}
		public String getAccountName() {
			return AccountName;
		}
		public void setAccountName(String accountName) {
			AccountName = accountName;
		}
		public float getAccountBalance() {
			return AccountBalance;
		}
		public void setAccountBalance(float accountBalance) {
			AccountBalance = accountBalance;
		}


		@Override
		public void deposit(float amount) {
			
			amount += amount;
			System.out.println("Amount Deposit");
			
		}
		
		@Override
		public void withdrawn(float amount) {
			
			if(amount <= 1000) {
			System.out.println("With Drawn Sucessfull");
			}
			else {
				System.out.println("With Drawn Not Sucessfull");
			}
			
		}
		
		
		
	}


