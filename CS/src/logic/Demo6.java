package logic;

import java.util.Random;
import java.util.Scanner;

public class Demo6 {


	public static void main(String[] args)   
	{  
		Random rdm = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		int num = 0,rev = 0;
		
		System.out.println("Enter phone number number :");
		long phone =sc.nextLong();
		
		if(phone>=8000000000l && phone<=8999999999l )
		{
			 num = rdm.nextInt(999999);
			 System.out.println(num);
		}
		else if(phone>=9000000000l && phone<=9999999999l)
		{
			num = rdm.nextInt(999999);
			System.out.println(num);
		}
		else if(phone>=7000000000l && phone<=7999999999l)
		{
			num = rdm.nextInt(999999);
			System.out.println(num);
		}
		else
		{
			System.out.println("Invalid Phone Number");
		}
		while(num!= 0)   
		{  
			int remainder = num % 10;  
			rev = rev * 10 + remainder;  
			num = num/10;  
		}  
//		System.out.println("The reverse number is: " +"\n"+ rev);  
		System.out.println("Enter OTP :");
		int otp =sc.nextInt();
		
		if(otp==rev)
		{
			System.out.println("Successfull !!!");
		}
		else
		{
			System.out.println("Somthing wrong try again");
		}
		
	}  

}










