package dcom;

import java.util.Scanner;

public class Demo {
	 
    public static void main(String[] args)
    {
 
    	Scanner sc = new Scanner(System.in);
    	String name = "CHANDRU@3";
    	System.out.println("enter character");
        char c = 'C';
        char b = 'S';
        int as = c;
        System.out.println("The ASCII value of " + c + " is: " + as+"\n");
        
        System.out.println("It's your password code");
    	for(int i=0;i<name.length();i++)
    	{
    		int a= name.charAt(i);
    		int d = a+as;
//    		System.out.print(name.charAt(i)+""+a+"  ");
    		System.out.print(d+" ");
//    		char ch = (char)d;
//    		System.out.print(d+""+ch+" ");

    	}
    	System.out.println("\n\nFor your password plz decode it\nenter your decode letter");
        char e = sc.next().charAt(0);
        
        if(e==c || e==b)
        {
        	for(int i=0;i<name.length();i++)
        	{
//        		System.out.print(name.charAt(i)+"");
        		
        		int a= name.charAt(i);
        		int d = a;
        		System.out.print(a+" ");
//        		System.out.print("\n"+d+" ");
        	}
        }
        else
        {
        	System.out.println("Enter correct deCode letter");
        }

    	
    	
    }
}
