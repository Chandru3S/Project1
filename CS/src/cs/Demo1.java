package cs;

import java.io.*;
import java.lang.Thread;
import java.util.Scanner;

public class Demo1 {

	// Java Program for sleeping the main thread.
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you Love me");
		String l =sc.next();
		
		if(l.equalsIgnoreCase("why"))
		{
			try {
				
					Thread.sleep(2000);
					System.out.println("Becuase I Love you");
					Thread.sleep(2000);
					System.out.println("Do you Love me");
					l =sc.next();
					
					if(l.equalsIgnoreCase("No"))
					{
						try {
							
								Thread.sleep(2000);
								System.out.println("But I Love you");
								for(int i=0;i<=100;i++)
								{
									Thread.sleep(1000);
									System.out.println("Plz Love me"+"😘💙😘");
								}
						}
						catch (Exception e) {

							// catching the exception
							System.out.println(e);
						}
					}
					if(l.equalsIgnoreCase("Yes"))
					{
						try {
							
							for(int i=0;i<=19;i++)
							{
								Thread.sleep(2000);
								System.out.println("I Love you too"+"😘💙😘");
							}
								
						}
						catch (Exception e) {

							// catching the exception
							System.out.println(e);
						}
					}
			}
			catch (Exception e) {

				// catching the exception
				System.out.println(e);
			}
		}
		else if(l.equalsIgnoreCase("No"))
		{
			try {
				
					Thread.sleep(2000);
					System.out.println("But I Love you");
					for(int i=0;i<=100;i++)
					{
						Thread.sleep(1000);
						System.out.println("Plz Love me"+"😘💙😘");
					}
			}
			catch (Exception e) {

				// catching the exception
				System.out.println(e);
			}
		}
		else if(l.equalsIgnoreCase("Yes"))
		{
			try {
				
				for(int i=0;i<=19;i++)
				{
					Thread.sleep(2000);
					System.out.println("I Love you too"+"😘💙😘");
				}
					
			}
			catch (Exception e) {

				// catching the exception
				System.out.println(e);
			}
		}
		else
		{
			try {
				
				for(int i=0;i<=10;i++)
				{
					Thread.sleep(2000);
					System.out.println("Hogeleee ninen Sundri alla"+"🥵😡🤬");
				}
					
			}
			catch (Exception e) {

				// catching the exception
				System.out.println(e);
			}
		}	

	}

}
