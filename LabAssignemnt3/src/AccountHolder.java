/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class AccountHolder 
{
     String name;
	static int Acc_Num=100;
	 int balance=0;
	
	AccountHolder(String naam)
	{
		name=naam;
		Acc_Num++;
	}
	
	public void displayInfo()
	{
		System.out.println("Account name is: "+ name+ "\nAccount number is: "+Acc_Num);
	}
	
	public void deposit(int amount)
	{
		balance=balance+amount;
	}
	
	public void withdraw(int amount)
	{
		if(balance>=amount)
		{
			balance=balance-amount;
		}
	}
	
	public void check_balance()
	{
		System.out.println("your balance is: "+ balance);
	}

	
}
