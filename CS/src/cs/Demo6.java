package cs;

/*
 * multiple inheritance is having multiple class 
 * arranged in such way that these 
 * classes will get properties 
 * from one another as shown in the diagram 
 * 
 * */


public class Demo6 {

	public static void main(String[] args) {
		
		Chilld c = new Chilld();
		Parentt p = new Parentt();
		
		System.out.println(c.height);
		System.out.println(p.height);
		
	}

}
class GrandParent
{
	
	float height= 6.0f;
}

class Parentt extends GrandParent
{
	
}
class Chilld extends Parentt 
{
	
}
