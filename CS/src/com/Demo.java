package com;

public class Demo {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.getA());

	}

}

class GrandParent
{
	private int a =19;
	
	GrandParent() 
	{
	
		System.out.println("Inside GrandParent");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

class Parent extends GrandParent
{
	public Parent() 
	{
	
		System.out.println("Inside Parent");
	}
}

class Child extends Parent
{
	Child()
	{
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("\nInside Child sub");
	}

}
