package poly;

public class jsd extends B{	
	public static void main(String[] args) {
		B b = new jsd();
		b.add();
		b.sub();
		b.mul();
		b.div();
	}		
}	 

abstract class B 
{
	void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	void sub()
	{
		int a = 10;
		int b = 20;
		int c = b-a;
		System.out.println(c);
	}
	void mul()
	{
		int a=10;
		int b=40;
		int c=a*b;
		System.out.println(c);
	}
	void div()
	{
		int a=40;
		int b=10;
		int c=a/b;
		System.out.println(c);
	}	
}
	









































		
