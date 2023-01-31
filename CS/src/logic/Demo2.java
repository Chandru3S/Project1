package logic;

import java.util.Scanner; 

public class Demo2 {

	public static void main(String args[])   
	{  
		
		int a[] = new int[256];  
		
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Please enter a string: ");  
		//reading a string from the user  
		String s = scanner.nextLine();    
		
		
		// loop through the string and count frequency of every character and store it in array  
		for (int i = 0; i < s.length(); i++)   
		{  
			a[(int) s.charAt(i)]++;  
		}  
		
		//print Frequency of characters  
		for (int i = 0; i < 256; i++)   
		{  
			if (a[i] != 0)   
			{  
				//prints frequency of characters      
				System.out.println((char) i + " --> " + a[i]);  
			}  
		}  
		
		
		
	}  
}  


