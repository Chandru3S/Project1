package s;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
	int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
for(int i=1;i<=a;i++)
	if(a%i==0)
		count++;
if(count==2)
	System.out.println("prime number");
	else
		System.out.println("not prime number");
	}

}
