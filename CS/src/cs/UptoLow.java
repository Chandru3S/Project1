package cs;

import java.util.Scanner;

public class UptoLow {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter word");
		String s= sc.next();
		
		System.out.println("Before changes: "+s);
		StringBuffer bf = new StringBuffer(s);
		
		for(int i=0;i<bf.length();i++)
		{
			if(Character.isLowerCase(bf.charAt(i)))
			{
				bf.setCharAt(i, Character.toUpperCase(bf.charAt(i)));
			}
			else
			{
				bf.setCharAt(i, Character.toLowerCase(bf.charAt(i)));
			}
		}
		System.out.println("\nafter  changes: "+bf);
	}

}
