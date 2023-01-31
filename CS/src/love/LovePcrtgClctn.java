package love;

import java.util.Random;
import java.util.Scanner;

public class LovePcrtgClctn {
	
	 void Love()
	{
		 Scanner sc = new Scanner(System.in);
		 
			System.out.println("Enter your name :");
			String name =sc.next();
			
			System.out.println("Enter your Bf/Gf name :");
			String b_gf =sc.next();
			
			Random rdm = new Random();
			
			if(name.equalsIgnoreCase(b_gf))
			{
				int p = rdm.nextInt(30,50);
				System.out.println("Your Love Pecentage :"+p+"%");
			}
			else
			{
				int p = rdm.nextInt(60,100);
				System.out.println("Your Love Pecentage :"+p+"%");
			}

	}
	 
	 void Friend()
	 {
		 Scanner sc = new Scanner(System.in);
		 
			System.out.println("Enter your name :");
			String name =sc.next();
			
			System.out.println("Enter your F_name name :");
			String b_gf =sc.next();
			
			Random rdm = new Random();
			
			if(name.equalsIgnoreCase(b_gf))
			{
				int p = rdm.nextInt(30,50);
				System.out.println("Your Friendship Pecentage :"+p+"%");
			}
			else
			{
				int p = rdm.nextInt(50,100);
				System.out.println("Your  Friendship  Pecentage :"+p+"%");
			}
	 }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("For Love Percentage press      : 1"+"\nFor Friendship Percentage press: 2");
		int press =sc.nextInt();
		
		LovePcrtgClctn lp = new LovePcrtgClctn();
		
		if(press==1)
		{
			lp.Love();
		}
		else if(press==2)
		{
			lp.Friend();
		}
		else
		{
			System.out.println("Plz enter valid number");
		}
		
	}

}
