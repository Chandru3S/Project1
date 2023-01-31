package collection;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the rows");
//	int n=sc.nextInt();
	int n=5,a=5,x=1,b=65;
	
	for(int i=1;i<=n;i++)
	{
		for(int k=0;k<a-1;k++)
		{
//			System.out.println(" ");
			
		}
		a--;
		for(int j=0;j<i;j++)
		{
			System.out.print((char)(b-j));
		}
		
		x++;
		b=b+x;
		System.out.println("");
	}
	

	}

}
