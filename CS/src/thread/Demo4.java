package thread;

class Two extends Thread
{
	@Override
	public void run() {
		
		int a=2,b;
		for(int i=1;i<11;i++)
		{
			b=a*i;
			System.out.println(a+"*"+i+" ="+b);
		}
	}
}

class Three extends Thread
{
	@Override
	public void run() {
		
		int a=3,b;
		for(int i=1;i<11;i++)
		{
			b=a*i;
			System.out.println(a+"*"+i+" ="+b);
		}
	}
}
class Four extends Thread
{
	@Override
	public void run() {
		
		int a=4,b;
		for(int i=1;i<11;i++)
		{
			b=a*i;
			System.out.println(a+"*"+i+" ="+b);
		}
	}
}
public class Demo4 {

	public static void main(String[] args) {
		
		Two t = new Two();
//		t.run();
		System.out.println("----------");
		Three th = new Three();
//		th.run();
		System.out.println("-----------");
		Four f = new Four();
//		f.run();
		
		t.start();
		th.start();
		f.start();

	}

}
