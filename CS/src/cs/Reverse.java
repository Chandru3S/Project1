package cs;

import java.io.*;
import java.util.Scanner;

class Reverse {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String str=sc.next();
		String rev="";
		char ch;

		System.out.print("Original word: "+str);

		for (int i=0; i<str.length(); i++)
		{
			ch= str.charAt(i); //extracts each character
			rev= ch+rev; //adds each character in front of the existing string
		}
		System.out.println("\nReversed word: "+ rev);
	}
}
