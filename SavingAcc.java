package com.money;

public abstract class SavingAcc extends BankAcc {

	private final boolean isSalaried;
	private static final float MINBAL = 200;

	

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float MINBAL) {
		
	}

	@Override
	public String toString() {
		return "SavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
