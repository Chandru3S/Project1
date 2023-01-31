package logic;

public class Demo12 {

	public static void main(String[] args) {

		String s = "Rooman";
		String s1=s;
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		} 
		System.out.println(s1);
		
		for(int i=1;i<s.length()-1;i++)
		{
			System.out.println(s.charAt(i)+"    "+rev.charAt(i));
		}
		System.out.println(rev);


	}

}
