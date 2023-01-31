package com;

public class Demo3 {

	public static void main(String[] args) {

		Child5 c = new Child5();
		
		c.display();
		c.play();

	}

}

class Parent3
{
	public void display()
	{
		System.out.println("hi");
	}
	public void play()
	{
		System.out.println("hi");
	}
	
}
class Child5 extends Parent3
{
	public void display()
	{
		System.out.println("bye");
	}
	public  play()
	{
		System.out.println("bye");
	}
}
