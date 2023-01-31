package cs;

public class Demo9 {
	
	public static void main(String[] args) {
		
		P p = new P();
		C c = new C();
		
		System.out.println(p.color);
		System.out.println(c.height);
		
	}

}

class P extends C
{
	String color ="Brown";
}
class C extends C
{
	float height = 6.3f;
}

