package thread;

import java.util.Scanner;

public class Demo1 {

	public static int add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("addition prog has started");
		System.out.println("Enter the first No");
		int a = sc.nextInt();
		System.out.println("Enter the second No");
		int b = sc.nextInt();
		
		int c=a+b;
		System.out.println("addition prog has ended. Sum is :"+c);
		return c;
	}
	
	public static void printChar()
	{
		System.out.println("Character printing has started");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("character printing has ended ");
	}
	
	public static void printNum() throws InterruptedException
	{
		System.out.println("printing No's has started");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(5000);
		}
		System.out.println("printing No's has ended");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		int sum=add();
		printChar();
		printNum();

		
	}

}
