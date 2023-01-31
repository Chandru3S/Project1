package cs;

class Demo8
{

	public static void main(String[] args) {

		Chilld2 c = new Chilld2();
		Child1 c1 = new Child1();

		System.out.println(c.height);
		System.out.println(c1.height);

	}
}
class GParent
{
	float height= 6.2f;
}

class Parent2 extends GParent
{

	
}

class Child11 extends Parent2
{

}
class Chilld222 extends Parent2
{

}