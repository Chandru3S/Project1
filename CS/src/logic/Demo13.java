package logic;

import java.util.Scanner;

public class Demo13 {
	
	Scanner sc = new Scanner(System.in);
	
	void continental()
	{
		String
		c1="Asia",
		c2="Africa",
		c3="America",
		c4="Europe",
		c5="South America",      
		c6="Australia";
		
		System.out.println("Choose your Continental :");
		System.out.println("1:"+c1+"\n"+"2:"+c2+"\n"+"3:"+c3+"\n"+"4:"+c4+"\n"+"5:"+c5+"\n"+"6:"+c6);
		int press = sc.nextInt();
		
		if(press==1)
		{
			Asia();
		}
		else
		{
			System.out.println("There is no avalibility of this situatiion\nPlease choose another Continental");
			continental();
		}	
	}
	void Asia()
	{
		String
		c1="India",
		c2="Srilanka",
		c3="Nepal",
		c4="China",
		c5="Japan",
		c6="Bhutan";	
		System.out.println("Choose your Country :");
		System.out.println("1:"+c1+"\n"+"2:"+c2+"\n"+"3:"+c3+"\n"+"4:"+c4+"\n"+"5:"+c5+"\n"+"6:"+c6);
		int press = sc.nextInt();
		
		if(press==1)
		{
			India();
		}
		else
		{
			System.out.println("There is no avalibility of this situatiion\nPlease choose another Country");
			Asia();
		}
	}
	void India()
	{
		String
		c1="Karnataka",
		c2="Kerala",
		c3="Tamilnadu",
		c4="AndraPradesh",
		c5="Maharashtra",
		c6="Dehli";	
		System.out.println("Wel-Come to India");
		System.out.println("\nChoose your State :");
		System.out.println("1:"+c1+"\n"+"2:"+c2+"\n"+"3:"+c3+"\n"+"4:"+c4+"\n"+"5:"+c5+"\n"+"6:"+c6);
		int press = sc.nextInt();
		
		if(press==1)
		{
			Karnataka();
		}
		else
		{
			System.out.println("There is no avalibility of this situatiion\nPlease choose another State");
			India();
		}
	}
	void Karnataka()
	{
		String
		c1="Luxuary",
		c2="Non-Luxuary";
		int a=6000,
			b=4200;
		System.out.println("Choose Room"+"\n"+"1:"+c1+" ="+a+"\n"+"2:"+c2+" ="+b);
		int press = sc.nextInt();
		if(press==1)
		{
			String
			v1="Car",
			v2="Bike";
			int car=1200,
				bike=600;
			
			System.out.println("Choose Vehicles"+"\n"+"1:"+v1+" ="+car+"\n"+"2:"+v2+" ="+bike);
			int pres = sc.nextInt();
			if(pres==1)
			{
				System.out.println("How many days you stay here sir/ma'am");
				int d = sc.nextInt();
				long t=(d*a)+(d*car);
				System.out.println("Your Total :"+t);
			}
			else
			{
				System.out.println("How many days you stay here sir/ma'am");
				int d = sc.nextInt();
				long t=(d*a)+(d*bike);
				System.out.println("Your Total :"+t);
			}
		}
		else
		{
			String
			v1="Car",
			v2="Bike";
			int car=1200,
				bike=600;
			
			System.out.println("Choose Vehicles"+"\n"+"1:"+v1+" ="+car+"\n"+"2:"+v2+" ="+bike);
			int pres = sc.nextInt();
			if(pres==1)
			{
				System.out.println("How many days you stay here sir/ma'am");
				int d = sc.nextInt();
				long t=(d*b)+(d*car);;
				System.out.println("Your Total :"+t);
			}
			else
			{
				System.out.println("How many days you stay here sir/ma'am");
				int d = sc.nextInt();
				long t=(d*b)+(d*bike);;
				System.out.println("Your Total :"+t);
			}
		}
	}
	public static void main(String[] args) {
		
		Demo13 d = new Demo13();
		d.continental();	
		
	}

}
