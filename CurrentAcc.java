package com.money;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
		
		// TODO Auto-generated constructor stub
	}
	

	public float getCreditLimit() {
		return creditLimit;
	}


	@Override
	public void withdraw(float a) {
		// TODO Auto-generated method stub
		super.withdraw(a);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
