package cs;

class Demo7
{

	public static void main(String[] args) {

		Chilld2 c = new Chilld2();
		Child1 c1 = new Child1();

		System.out.println(c.height);
		System.out.println(c1.height);

	}
}
class Parent1
{

	float height= 6.f;
}

class Child1 extends Parent1
{

}
class Chilld2 extends Parent1
{

}