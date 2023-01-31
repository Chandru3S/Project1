package com;

public class Demo6 {

	public static void main(String[] args) {
		
		Animall a = new Animall();
		a.eats();
		a.lifeStyle();
		System.out.println("\n----------------------------");
		Deer d = new Deer();
		d.eats();
		d.lifeStyle();
		System.out.println("\n----------------------------");
		Lion l = new Lion();
		l.eats();
		l.lifeStyle();
		System.out.println("\n----------------------------");
		Monkey m = new Monkey();
		m.eats();
		m.lifeStyle();
		

	}

}

class Animall
{
	void eats()
	{
		System.out.println("All Animals are eat Somthing");
	}
	void lifeStyle()
	{
		System.out.println("Every Animal have own LifeStyle");
	}
}

class Deer extends Animall
{
	void eats()
	{
		System.out.println("Deer is eats lots of honey");
	}
	void lifeStyle()
	{
		System.out.println("Deer Animal have more hair over body comaparing to other animals");
	}
}

class Lion extends Animall
{
	void eats()
	{
		System.out.println("Lion is hunting and eats meat only ");
	}
	void lifeStyle()
	{
		System.out.println("Lion is living like a king in the Forest ");
	}
}
class Monkey extends Animall
{
	void eats()
	{
		System.out.println("Monkey is eating Banana and Fruits etc...");
	}
	void lifeStyle()
	{
		System.out.println("Monkey is living like a  naughty... and Joyfull");
	}
}




















