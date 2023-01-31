package exception;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
		int b[]=new int[a];
		//System.out.println(a);
		System.out.println("Enter data to be inserted");
		int data = sc.nextInt();
		System.out.println("Enter where data to be inserted");
		int index = sc.nextInt();
		b[index]=data;
		System.out.print("b[] = {");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+",");
		}
		System.out.print("}");
		
	}

}
