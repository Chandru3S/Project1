package exception;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int a[]= {1,2,3,4,5};
//		System.out.println(a[5]);
		
		try
		{
			int a[]= {1,2,3,4,5};
			System.out.println("Enter index value");
			int b = sc.nextInt();
			System.out.println(a[b]);
		}
		catch(Exception e)
		{
			System.out.println("Enter valid index");
		}

	}

}
