package cs;

import java.util.Scanner;

public class Demo {

	static String lv;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Hi, Baby"+"\nDo you Love me");
		lv = sc.nextLine();
		if(lv.equals("yes"))
		{
			System.out.println("Thank you  😘😘😘💖💙🧡");
			System.out.println("baby can i get your number ,😎😎😎😘😘😘");
			String num = sc.next();
			if(num.equals("take-it"))
			{
				System.out.println("Tell me baby,🥰💙💞💙");
			}
			else
			{
				System.out.println("Hogeleee nina ena dodda sundri alla 🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏"
						+ "");

				try {

					Thread.sleep(6000);
					System.out.println("Sorry Sorry\nAtleast give your sister Number");

				}
				catch (Exception e) {

					System.out.println(e);
				}
			}
		}
		else if(lv.equals("no"))
		{
			System.out.println("Your bad luck get lost 😡🤬😡");
			try {

				Thread.sleep(6000);
				System.out.println("wait wait\nAtleast give your friend Number");

			}
			catch (Exception e) {

				System.out.println(e);
			}

		}
		else
		{
			System.out.println("Take your own time baby  😍🥰😍");
		}

	}

}

