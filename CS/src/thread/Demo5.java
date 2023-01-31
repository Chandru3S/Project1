package thread;

class Two1 implements Runnable
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

class Three1 implements Runnable
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
class Four1 implements Runnable
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


public class Demo5 {

	public static void main(String[] args) {
		
		Two1 t = new Two1();
		Three1 thr = new Three1();
		Four1 f = new Four1();
		
		Thread th1 = new Thread(t);
		Thread th2 = new Thread(thr);
		Thread th3 = new Thread(f);
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(Thread.currentThread());
			
	}

}
