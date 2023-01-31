package com;

public class Demo7 {

	public static void main(String[] args) {

		Child7 c1 = new Child7();
		Child8 c2 = new Child8();
		Child9 c3= new Child9();
		
		c1.cry();
		c2.cry();
		c3.cry();

	}

}

class Parent5
{
	void cry()
	{
		System.out.println("Parent doesn't cry");
	}
}

class Child7 extends Parent5
{
	void cry()
	{
		System.out.println("Child cries at low voice");
	}
}
class Child8 extends Parent5
{
	void cry()
	{
		System.out.println("Child cries at medium voice");
	}
}
class Child9 extends Parent5
{
	void cry()
	{
		System.out.println("Child cries at high voice");
	}
}








