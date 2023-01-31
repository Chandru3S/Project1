package intrfce;

public class Demo4 {
	public static void main(String[] args) {
//		Display d = (int i, int j)->{			
//			System.out.println("hi, baby "+i+""+j);
//		};
//		d.disp(3, 19);
	}
}
interface Display
{
	private static void disp(int a, int b)
	{
		System.out.println("\b/hi, baby" );
	}
}