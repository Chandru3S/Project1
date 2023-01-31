package thread;

class D1 extends Thread
{
	@Override
	public void run() {

		for(int i=1;i<100;i++)
		{
			System.out.println(i);
			if(i==30)
			{
				System.out.println("Red");
				break;
			}
			else
			{
				try {
					sleep(3000);

				} catch (InterruptedException e) {

					e.printStackTrace();
				}
//				System.out.println("Green");
			}
		}
	}

}
public class Demo7 {

	public static void main(String[] args) {
		D1 d1 = new D1();
		d1.start();
	}

}
