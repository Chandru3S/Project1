package com;

public class Demo4 {

	public static void main(String[] args) {
		
		Child6 c = new Child6();
		c.display();

	}

}

class Animal
{
	
}
class Tiger extends Animal
{
	
}
class Parent4
{
	Animal display()
	{
		System.out.println("Hello Baby");
//		return null;
		Animal a = new Animal();
		return a;
		
	}
}
class Child6 extends Animal
{
	Tiger display()
	{
//		return null;
		System.out.println("Hii baby");
		Tiger t = new Tiger();
		return t;
		
	}
	
}
