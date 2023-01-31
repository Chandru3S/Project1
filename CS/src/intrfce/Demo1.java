package intrfce;

public class Demo1 {

	public static void main(String[] args) {
		
		Calculator1 c1 = new Calculator1();
		c1.add();
		c1.sub();
		Calculator2 c2 = new Calculator2();
		c2.add();
		c2.sub();
//		Calculator3 c3 = new Calculator3();
//		c3.add();
//		c3.sub();
		
//		calculator c = new Calculator3();
//		c.add();
//		c.sub();
		
		calculator c ;
		c.add();
		c.sub();
	}

}
interface calculator
{
	public abstract void add();
	public abstract void sub();
}

class Calculator1 implements calculator
{
	public void add()
	{
		System.out.println("hi, baby");
	}
	public void sub()
	{
		System.out.println("bye, baby");
		System.out.println("------------------");
	}
}
class Calculator2 extends Calculator1
{
	public void add()
	{
		int a= 3;
		int b=19;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a= 3;
		int b=19;
		int c=b-a;
		System.out.println(c);
		System.out.println("------------------");
	}
}
class Calculator3 extends Calculator2
{
	public void add()
	{
		int a= 5;
		int b=45;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a= 19;
		int b=3;
		int c=a-b;
		System.out.println(c);
		System.out.println("------------------");
	}
}























