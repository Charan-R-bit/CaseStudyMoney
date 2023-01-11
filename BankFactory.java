package com.money;

public abstract class BankFactory 
{
	public SavingAcc getNewSavingAcc(int accNo, String accNm,float accBal,boolean isSalaried)
	{
		return getNewSavingAcc(12352, "Charan", 1212121f, false) ;	
	}
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm,float accBal,float creditLimit)
	{
		return getNewCurrentAcc(12354, "Devine", 12132f, 2000);
	}
}


	
	