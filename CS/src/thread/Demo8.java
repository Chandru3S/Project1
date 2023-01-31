package thread;

public class Demo8 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<3;i++)
		{
			try {
				sleep(3000);
				System.out.println("Thread 1st"+Thread.currentThread());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {

		Demo8 d1 = new Demo8();
		Demo8 d2 = new Demo8();
		Demo8 d3 = new Demo8();
		
		d1.start();
		try {
			sleep(3000);
			System.out.println("Thread 1st"+Thread.currentThread());
			d2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		d2.start();
		try {
			sleep(3000);
			System.out.println("Thread 2nd"+Thread.currentThread());
			d1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		d3.start();
		try {
			sleep(3000);
			System.out.println("Thread 3rd"+Thread.currentThread());
			d2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}
