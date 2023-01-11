package com.money;

import java.util.Scanner;

public class main {
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the choice");
		int a =sc.nextInt();
		System.out.println("1.Saving account\n 2.Current account");
		switch(a)
		{
		case 1 : MMBankFactory m = new MMBankFactory();
				System.out.println(m.getNewSavingAcc(21221, "Charan", 12113f, true));
		}

	}

}
