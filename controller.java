package com.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.money.MMBankFactory;
import com.money.MMSavingAcc;
import com.money.SavingAcc;

@Controller
@RequestMapping("/getSavingAcc")
public class controller 
{
	MMBankFactory mmbankfactory;
	@GetMapping("/get")
	public MMSavingAcc get()
	{
			return mmbankfactory.getNewSavingAcc(0, null, 0, null);
	}

	
}
