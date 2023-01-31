package logic;

public class Demo1 {
	
	public static void main(String[] args) {
		
		String s = "2a3b4c";
		String ans = "";
		for(int i = 0; i < s.length();i++)
		{
			int num = 0;
			
			while(s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				num = num * 10 + (s.charAt(i) - '0');
				i++;
			}
			while(num-- > 0){
				ans += s.charAt(i);
			}
			
			
		}
		System.out.println(ans);
	}

}





