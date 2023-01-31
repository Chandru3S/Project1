package cs;

import java.util.Random;
import java.util.Scanner;

public class LogIn {

	Scanner sc = new Scanner(System.in);
	Random rdm = new Random();
	
	void Login()
	{
		System.out.println("Enter your mobile number");
		long phone = sc.nextLong();
		
		if(phone==7996269545l)
		{
			System.out.println("Enter your Password");
			String pass=sc.next();
			if(pass.equals("Chandru@3"))
			{
				System.out.println("Login successfully");
			}
			else
			{
				System.out.println("Invalid password,\nPlease enter correct password");
				pass=sc.next();
				if(pass.equals("Chandru@3"))
				{
					System.out.println("Login successfully");
				}
				else
				{
					System.out.println("Invalid password,\nPlease enter correct password");
					
					Login();
				}
				
			}
		}
		else
		{
			System.out.println("Invalid phone number ,\nPlease enter correct phone number");
			phone = sc.nextLong();
			if(phone==7996269545l)
			{
				System.out.println("Enter your Password");
				String pass=sc.next();
				if(pass.equals("Chandru@3"))
				{
					System.out.println("Login successfully");
				}
				else
				{
					System.out.println("Invalid password,\nPlease enter correct password");
					pass=sc.next();
					if(pass.equals("Chandru@3"))
					{
						System.out.println("Login successfully");
					}
					else
					{
						System.out.println("Invalid password,\nPlease enter correct password");
						
						Login();
					}
					
				}
			}
			else
			{
				System.out.println("Invalid phone number ,\nPlease enter correct phone number");
				Login();
			}
		}
	}
	int OTP;
	void Forget()
	{
		System.out.println("Enter your phone number");
		long phone = sc.nextLong();
		int otp = rdm.nextInt(99999);
		System.out.println(otp);
		System.out.println("Enter the OTP Already sent it ");
		int OTP = sc.nextInt();
		
		if(OTP==otp)
		{
			System.out.println("To change the password press 1");
			int chg = sc.nextInt();
			if(chg==1)
			{
				Change();
			}
			else
			{
				System.out.println("Login successfully");
			}
		}
		else
		{
			System.out.println("Please enter correct OTP");
			OTP = sc.nextInt();
			if(OTP==otp)
			{
				System.out.println("To change the password press 1");
				int chg = sc.nextInt();
				if(chg==1)
				{
					Change();
				}
				else
				{
					System.out.println("Login successfully");
				}
			}
			else
			{
				System.out.println("Please enter correct OTP");
				Forget();
			}
		}			
	}
	
	void Change()
	{
		Login();
		System.out.println("Enter your Old password");
		String old = sc.next();
		if(old.equals("Chandru@3"))
		{
			System.out.println("Enter your New Passaword");
			String New = sc.next();
			System.out.println("Conform your New Passaword");
			String cnfm = sc.next();
			
			if(New.equals(cnfm))
			{
				System.out.println("Password was changed Successfully");
			}
			else
			{
				System.out.println("Password is not matched\nplease enter once");
				New = sc.next();
				System.out.println("Conform your New Passaword");
				cnfm = sc.next();
				
				if(New.equals(cnfm))
				{
					System.out.println("Password was changed Successfully");
				}
				else
				{
					System.out.println("Password is not matched\ntry again after some time");
					Change();
					
				}
				
			}
		}
		else
		{
			System.out.println("Invalid password \nplease enter correct password");
			old = sc.next();
			if(old.equals("Chandru@3"))
			{
				System.out.println("Enter your New Passaword");
				String New = sc.next();
				System.out.println("Conform your New Passaword");
				String cnfm = sc.next();
				
				if(New.equals(cnfm))
				{
					System.out.println("Password was changed Successfully");
				}
				else
				{
					System.out.println("Password is not matched\nplease enter once");
					New = sc.next();
					System.out.println("Conform your New Passaword");
					cnfm = sc.next();
					
					if(New.equals(cnfm))
					{
						System.out.println("Password was changed Successfully");
					}
					else
					{
						System.out.println("Password is not matched\ntry again after some time");
						Change();
						
					}
					
				}
			}
			else
			{
				System.out.println("Invalid password \ntry again after some time");
				Change();
			}
		}
			
	}
	
	void Register()
	{
		System.out.println("Enter your First Name:");
		String fname =sc.next();
		System.out.println("Enter your Last Name:");
		String lname =sc.next();
		System.out.println("Enter your phone number:");
		long phone =sc.nextLong();
		System.out.println("enter your date birth");
		String date = sc.next();
		System.out.println("enter your password");
		String pass = sc.next();
		System.out.println("Conform your password");
		String cpass = sc.next();
		
		if(pass.equals(cpass))
		{
			try
			{
				Thread.sleep(5000);
				System.out.println("Your account is created");
			}
			catch(Exception e)
			{
				System.out.println("Not created ");
			}
			System.out.println("If you want login ");
			String y = sc.next();
			
			if(y.equalsIgnoreCase("yes"))
			{
				Login();
			}
			else
			{
				Option();
			}
			
		}
		else
		{
			System.out.println("Password is not matched\nplease enter once");
			pass = sc.next();
			System.out.println("Conform your password");
			cpass = sc.next();
			if(pass.equals(cpass))
			{
				try
				{
					Thread.sleep(5000);
					System.out.println("Your account is created");
				}
				catch(Exception e)
				{
					System.out.println("Not created ");
				}
				System.out.println("If you want login ");
				String y = sc.next();
				
				if(y.equalsIgnoreCase("yes"))
				{
					Login();
				}
				else
				{
					Option();
				}
				
			}
			else
			{
				System.out.println("Password is not matched\nplease try again after some time");
				Register();
				
			}
		}
		
		
		
	}
	
	
	void Option()
	{
		LogIn lg = new LogIn();
		System.out.println("Choose your option");
		System.out.println("If you want Log-in press               1"
						 + "\nIf you Forget your PAssword press      2"
						 + "\nIf you want Change your password press 3"
						 +"\nIf you want create new Account         4");
		
		int press = sc.nextInt();
		if(press==1)
		{
			lg.Login();
		}
		else if(press==2)
		{
			lg.Forget();
		}
		else if(press==3)
		{
			lg.Change();
		}
		else if(press==4)
		{
			lg.Register();
		}
		else
		{
			System.out.println("It is not in a option\n please enter correct option");
			press = sc.nextInt();
			if(press==1)
			{
				lg.Login();
			}
			else if(press==2)
			{
				lg.Forget();
			}
			else if(press==3)
			{
				lg.Change();
			}
			else if(press==4)
			{
				lg.Register();
			}
			else
			{
				System.out.println("Invalid option \n please try again after some time");
				Option();
			}
		}
	}
			
	public static void main(String[] args) {
			
		LogIn lg = new LogIn();
		lg.Option();
	}
}
