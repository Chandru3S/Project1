package thread;

class Two2 extends Thread
{
	public void run() {
		
		Thread t = Thread.currentThread();
		String n =t.getName();
		
		if(n.equals("2"))
		{
			run1();
		}
		else if(n.equals("3"))
		{
			run2();
		}
		else 
		{
			run3();
		}
		
	}


	public void run1() {

		int a=2,b;
		for(int i=1;i<11;i++)
		{
			b=a*i;
			System.out.println(a+"*"+i+" ="+b);
		}
	}
	public void run2() {

		int a=3,b;
		for(int i=1;i<11;i++)
		{
			b=a*i;
			System.out.println(a+"*"+i+" ="+b);
		}
	}
	public void run3() {

		int a=4,b;
		for(int i=1;i<11;i++)
		{
			b=a*i;
			System.out.println(a+"*"+i+" ="+b);
		}
	}


	public void setName(int i) {
		// TODO Auto-generated method stub
		
	}

}


public class Demo6 {

	public static void main(String[] args) {

		Two2 t1 = new Two2();
		Two2 t2 = new Two2();
		Two2 t3 = new Two2();
		
		t1.setName("2");
		t2.setName("3");
		t3.setName("4");
		
		t1.start();
		t2.start();
		t3.start();
	
			
	}



}
