package logic;

public class Demo14 extends Thread
{
	@Override
	public void run() {
		int c=0;
		for(int i=1;i<11;i++)
		{
			try {
				sleep(1000);
				c=c+1;
				System.out.print(c);
			} catch (InterruptedException e) {
 
				e.printStackTrace();
			}
			
		}
		
			
	}
	public static void main(String[] args) {

		Demo14 d = new Demo14();
		d.start();;
		
	}

}
