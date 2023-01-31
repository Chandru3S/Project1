package cs;

import java.util.HashMap;

public class Occurence {

	public static void main(String[] args) {
	
		String s = "SODRRRTTYYRYTR";
		HashMap <Character , Integer> hm = new HashMap<>();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				int c=hm.get(s.charAt(i));
				hm.put(s.charAt(i),++c );
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}

}
