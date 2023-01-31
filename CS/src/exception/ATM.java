package exception;

import java.util.Scanner;

public class ATM {
	
	private int bal = 4500;
	
	public void withDraw(int amt) throws NosufficientBal
	{
		if(amt>bal)
		{
			throw new NosufficientBal("you try to withdraw more than your balance");
		}
		System.out.println("Withdraw Succefull !!!");
	}
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw amount");
		int amnt = sc.nextInt();
		
		ATM a = new ATM();
		
		try {
			a.withDraw(amnt);
		} catch (NosufficientBal e) {
		
			e.printStackTrace();
		}
		
		
		
	}
}
