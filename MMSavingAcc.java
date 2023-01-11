package com.money;

public class MMSavingAcc extends SavingAcc
{
	
	private static final float MINBAL =200;
	

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	

	@Override
	public void withdraw(float MINBAl) 
	{
		if (this.MINBAL < getAccBal()) {
			System.out.println("Balance Above Minimum balance eligible for transaction: ");
		} else {
			System.out.println("Your balance is less than " + this.MINBAL + "\tTransaction failed...!!");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
