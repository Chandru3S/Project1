package s;

import java.util.Random;
import java.util.Scanner;

public class PasswordPinCrack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random cs = new Random();
		
		System.out.println("Enter your Pin");
		long pass = sc.nextLong();
		long c= 0;
		long n = 100000000000000l;
		
		if(pass>999 && pass <10000)
		{
			for(int i=0;i<n;i++)
			{
				int pin = cs.nextInt(1000, 9999);
				System.out.println(pin);
				c++;
				if(pin==pass)
				{
					System.out.println("Password Pin :"+pin+"\nCount :"+c);
					break;
				}
			}		
		}
		else if(pass>99999 && pass<1000000)
		{
			for(long i=0;i<n;i++)
			{
				long pin = cs.nextLong(100000, 999999);
				System.out.println(pin);
				c++;
				if(pin==pass)
				{
					System.out.println("Password Pin :"+pin+"\nCount :"+c);
					break;
				}
			}	
		}
		else if(pass>9999999 && pass<100000000)
		{
			for(long i=0;i<n;i++)
			{
				long pin = cs.nextLong(10000000, 99999999);
				System.out.println(pin);
				c++;
				if(pin==pass)
				{
					System.out.println("Password Pin :"+pin+"\nCount :"+c);
					break;
				}
			}	
		}
		else if(pass>999999999 && pass<10000000000l)
		{
			for(long i=0;i<n;i++)
			{
				long pin = cs.nextLong(1000000000, 9999999999l);
				System.out.println(pin);
				c++;
				if(pin==pass)
				{
					System.out.println("Password Pin :"+pin+"\nCount :"+c);
					break;
				}
			}	
		}
		else
		{
			System.out.println("Entered pin not 4, 6, 8, 10 Digit No");
		}
	}

}



























