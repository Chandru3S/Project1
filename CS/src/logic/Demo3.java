package logic;

import java.util.HashMap;  

public class Demo3 {

	public static void main(String args[])   
	{  

		String s = "banana";  

		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> hs = new HashMap<>();  


		for (int i = 0; i<s.length(); i++)   
		{  
			if(hs.containsKey(s.charAt(i)))   
			{  
				int count = hs.get(s.charAt(i));  
				hs.put(s.charAt(i), ++count);  
			}   
			else   
			{  
				hs.put(s.charAt(i),1);  
			}  
		}  
		System.out.println(hs);  
	}  
}  


