package poly;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hi baby");
		 Parent p = new Child1();	
		 p.cry();
		 p = new Child2();
		 p.cry();
		 p = new Child3();
		 p.cry();
	
	}

}

class Parent
{
	void cry()
	{
		System.out.println("Parent doesn't cry");
	}
}
class Child1 extends Parent
{
	void cry()
	{
		System.out.println("Child1 cries at small voice");
	}
}
class Child2 extends Parent
{
	void cry()
	{
		System.out.println("Child2 cries at medium voice");
	}
}
class Child3 extends Parent
{
	void cry()
	{
		System.out.println("Child3 cries at high voice");
	}
	void cry(int a)
	{
		System.out.println("Child3 cries at high voice 1");
	}
	void cry(String b)
	{
		System.out.println("Child3 cries at high voice 2");
	}
	
}

























