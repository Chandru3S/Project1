package logic;

public class Demo8 {

	public static void main(String[] args) {

		String s = "    My Name Is Chandru    ";
		String ss=s.trim();
		System.out.println(ss);
		System.out.println("--------------------");

		String a[] = s.split("\\s");

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
		
		System.out.println("\n--------------------");
		
		System.out.println(s.replaceAll(" ", ""));
		System.out.println("\n--------------------");
		
		

		
		
	}

}













