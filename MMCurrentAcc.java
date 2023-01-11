package com.money;

public class MMCurrentAcc extends CurrentAcc
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	@Override
	public void withdraw(float MINBAL) 
	{
		if(getAccBal()>MINBAL && getAccBal()<getCreditLimit())
		{
			System.out.println("Eligible for withdrawal");
		}
		else
		{
			System.out.println("Credit limit reached/ minimum balance reached");
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
