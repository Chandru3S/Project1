package com;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Child2 c2 = new Child2();
		c2.color();
		c2.height();
		c2.nose();
		c2.eyeColor();
		c2.code();
		System.out.println("====================");
		
		Child3 c3 = new Child3();
		c3.color();
		c3.height();
		c3.nose();
		c3.eyeColor();
		c3.swim();
		
		System.out.println("====================");
		
		Child4 c4 = new Child4();
		c4.color();
		c4.height();
		c4.nose();
		c4.eyeColor();
		c4.play();
	}

}

class Parent2
{
	void color()
	{
		System.out.println("I have Brown Clolor");
	}
	void height()
	{
		System.out.println("I have 5.6ft Height");
	}
	void nose()
	{
		System.out.println("I have 2.3cm length nose");
	}
	void eyeColor()
	{
		System.out.println("I have Brown Eye Clolor");
	}
}

class Child2 extends Parent2
{
	void nose()
	{
		System.out.println("I have 1.5cm length nose");
	}
	void eyeColor()
	{
		System.out.println("I have Black Eye Clolor");
	}
	void code()
	{
		System.out.println("I Write Code");
	}
	
}

class Child3 extends Parent2
{
	void nose()
	{
		System.out.println("I have 1.8cm length nose");
	}
	void eyeColor()
	{
		System.out.println("I have Blue Eye Clolor");
	}
	void swim()
	{
		System.out.println("I can Swim in the Pond");
	}
	
}

class Child4 extends Parent2
{
	void nose()
	{
		System.out.println("I have 2cm length nose");
	}
	void eyeColor()
	{
		System.out.println("I have Green Eye Clolor");
	}
	void play()
	{
		System.out.println("I can Play the Cricket");
	}
	
}




















