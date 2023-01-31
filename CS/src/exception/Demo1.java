package exception;

import java.util.Scanner;

//CASE 1: 10/2
public class Demo1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		try 
		{
			System.out.println("Enter the numerator");
			int a = sc.nextInt();
			System.out.println("Enter the denominator");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
			System.out.println("Program Terminated");
			c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Give Valid Denominator");
		}

	}
}
//CASE 2: 10/0