package com.yedam.ljw.classes;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public String getAno() {
		return ano;
	}
	public String getOwner() {
		return owner;
	}
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int amount) {
		if(amount >= 10 && amount <= 100000) {
			balance  = balance + amount;
		}else {
			System.out.println("안돼요~");
		}
	}
	
	public void withdrawBalance(int amount) {
		if(amount >= 10 && amount <= 100000) {
			balance  = balance - amount;
		}else {
			System.out.println("안돼요~");
		}
	}
	
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}
	public String toString2() {
		return "이름: " + ano +
				"\n 계좌번호: " + owner +
				"\n 잔액: " + balance;
	}
	
}
