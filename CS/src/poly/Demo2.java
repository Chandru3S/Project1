package poly;

public class Demo2 {

	public static void main(String[] args) {
		
		Demo a = new A();
		a.add();
		
	}
}

class A extends Demo
{
	 void add()
	 {
			 System.out.println("hi, baby");
	 }
}

abstract class Demo 
{
	abstract void add();
}
