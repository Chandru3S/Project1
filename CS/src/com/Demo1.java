package com;

public class Demo1 {

	public static void main(String[] args) {
		
		Child1 c =new Child1();

	}

}

class Parent1
{
	Parent1()
	{
		System.out.println("Parent Constructor One Parameter");
	}

}
class Child1 extends Parent1
{
	Child1()
	{
		this("Chandru");
		System.out.println("Zero Parameter");
	}
	Child1(String n)
	{
		this(24, "Ravi", 2.4f);
		System.out.println("One Parameter");
	}
	Child1(int a, String b, float c)
	{
//		super();
		System.out.println("\nTwo Parameter");
	}
}
