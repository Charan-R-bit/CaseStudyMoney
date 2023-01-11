package com.money;


public  abstract class BankAcc 
{	
	private final int accNo;
	private String accNm;
	private final float accBal;
	
	


	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public void withdraw(float a)
	{
		
	}
	public void deposite(float b)
	{
		
	}


	public String getAccNm() {
		return accNm;
	}


	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}


	public int getAccNo() {
		return accNo;
	}


	public float getAccBal() {
		return accBal;
	}


	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

	
	
}
