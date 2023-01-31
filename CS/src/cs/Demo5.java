package cs;

public class Demo5 {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.haircolor);
		System.out.println(c.eyeColor);
		
	}

}

class Parent
{
	
	String haircolor = "Black";
	String eyeColor= "Brown";
}
class Child extends Parent
{
	
}
