package com;

public class Demo5 {

	public static void main(String[] args) {
	
		PassangerPlane p = new PassangerPlane();
		p.takeOff();
		p.fly();
		p.land();
		System.out.println("\n-----------------------");
		CargoPlane c = new CargoPlane();
		c.takeOff();
		c.fly();
		c.land();
		System.out.println("\n-----------------------");
		FighterPlane f = new FighterPlane();
		f.takeOff();
		f.fly();
		f.land();
		
	}

}

class Plane
{
	void takeOff()
	{
		System.out.println("Plane is Take Off");
	}
	void fly()
	{
		System.out.println("Plane is flying in the sky");
	}
	void land()
	{
		System.out.println("Plane is just Landing");
	}
	
}

class PassangerPlane extends Plane
{
	
}

class CargoPlane  extends Plane
{
	void takeOff()
	{
		System.out.println("Cargo Plane is Take Off");
	}
	void fly()
	{
		System.out.println("Cargo Plane is flying in the sky");
	}
	void land()
	{
		System.out.println("Cargo Plane is just Landing");
	}
}
class FighterPlane  extends Plane
{
	void takeOff()
	{
		System.out.println("Fighter Plane is Take Off");
	}
	void fly()
	{
		System.out.println("Fighter Plane is flying in the sky");
	}
	void land()
	{
		System.out.println("Fighter Plane is just Landing");
	}
}



























