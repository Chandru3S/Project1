package intrfce;

public class Demo2 {

	public static void main(String[] args) {
		
		Demo3 d = new Demo3();
		d.display();
		

	}

}


interface Demoo1
{
	public abstract void display();
	public abstract void display1();
}
class Demo3 implements Demoo1
{

	@Override
	public void display() {
		
		System.out.println("hi, baby");
		
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		
	}
	
}