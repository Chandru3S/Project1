package intrfce;

public class Main {

	
	public static void main(String[] args) {
		
		Outer.Inner oc=new Outer.Inner();		
		System.out.println(oc.a);
		oc.display();		
	}
}
class Outer
{
		static class Inner
		{
			int a= 19;
			
			public void display()
			{
				System.out.println("hi, baby");
			}
		}
		
	
}