package exception;

import java.util.Scanner;

public class Driving {

	private int age = 18;

	public void license(int dl) throws StillMinorException
	{
		if(dl<age)
		{
			throw new StillMinorException("Your age is less than the Required age for License");
		}
		System.out.println("License varification is done");
	}

	public static void main(String[] args) throws StillMinorException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int agg = sc.nextInt();

		Driving d = new Driving();
		
		d.license(agg);


	}

}
