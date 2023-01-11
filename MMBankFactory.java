package com.money;

public class MMBankFactory extends BankFactory
{
	public MMSavingAcc getNewSavingAcc(int accNo,String accNm,float accBal, Boolean isSalaried)
	{
		return new MMSavingAcc(12121, "Charu",12345f, false);
	}
	public MMCurrentAcc getNewCurrentAcc(int accNo,String accNm, float accBal, float creditLimit)
	{
		return new MMCurrentAcc(12134,"Charu",12312f,2300f);
	}
}
