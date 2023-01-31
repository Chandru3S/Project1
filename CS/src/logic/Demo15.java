package logic;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("select correct ans for each Question");
		System.out.println("------------------------------------");
		
		System.out.println("\n1. MVC means"+"\na).Made Visual Code"+"\nb).Make Visual Code"+
											"\nc).Model View Controller"+"\nd).Make View Controller");
		System.out.println("Enter your Ans here");
		String a = sc.next();
		
		System.out.println("\n2. J2EE means"+"\na).Java 2 Enterprise Edition"+"\nb).Java 2 Effect Edition"+
				"\nc).Java 2 Early Edition"+"\nd).Java 2 Effect Early");
		System.out.println("Enter your Ans here");
		String b = sc.next();
		
		System.out.println("\n3. JSP means"+"\na).Java Standard Programs"+"\nb).Java Standalone Programs"+
				"\nc).Java Server Programs"+"\nd).Java Server Pages");
		System.out.println("Enter your Ans here");
		String c = sc.next();
		
		System.out.println("\n4. HQL means"+"\na).Highlevel Query Language"+"\nb).Hibernet Query Language"+
				"\nc).Hardcore Query Language"+"\nd).Happy Query Language");
		System.out.println("Enter your Ans here");
		String d = sc.next();
		
		System.out.println("\n1. IOC means"+"\na).Inversion of Controller"+"\nb).Iteration of Common"+
				"\nc).Intract of Controller"+"\nd).Inversion of Comm");
		System.out.println("Enter your Ans here");
		String e = sc.next();
		
		double count=0;
		double w = 0.25;
		if(a.equalsIgnoreCase("c"))
		{
			count++;
		}
		else
		{
			count=count-w;
		}
		if(b.equalsIgnoreCase("a"))
		{
			count++;
		}
		else
		{
			count=count-w;
		}
		if(c.equalsIgnoreCase("d"))
		{
			count++;
		}
		else
		{
			count=count-w;
		}
		if(d.equalsIgnoreCase("b"))
		{
			count++;
		}
		else
		{
			count=count-w;
		}
		if(e.equalsIgnoreCase("a"))
		{
			count++;
		}
		else
		{
			count=count-w;
		}
		System.out.println("Your score is : "+count);
		
		double p = (count*100)/5;
		System.out.println("Your % is : "+p);
		
		if(p>=90)
		{
			System.out.println("Grade is : A+");
		}
		else if(p>=80)
		{
			System.out.println("Grade is : A");
		}
		else if(p>=70)
		{
			System.out.println("Grade is : B+");
		}
		else if(p>60)
		{
			System.out.println("Grade is : B");
		}
		else if(p>50)
		{
			System.out.println("Grade is : c+");
		}
		else if(p>40)
		{
			System.out.println("Grade is : C");
		}
		else
		{
			System.out.println("Grade is : F");
		}        
	}

}
