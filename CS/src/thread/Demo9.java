package thread;

public class Demo9 extends Thread{

	@Override
	public void run() {
		int i,count;
		System.out.print("Enter n value : ");
		int n=20;
		System.out.println("Prime numbers between 1 to "+n+" are ");
		for(i=2;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;        
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
				     
		}
	}


	public static void main(String[] args) {

		Demo9 d1 = new Demo9();
		Demo9 d2 = new Demo9();
		Demo9 d3 = new Demo9();
		
		d1.start();
		System.out.println("------------------");
		try {
			for(int i=0;i<20;i=i+2)
			{
				sleep(3000);
				System.out.println(i);
				d2.join();
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		d2.start();
		System.out.println("------------------");
		try {
			for(int i=1;i<20;i=i+2)
			{
				sleep(3000);
				System.out.println(i);
				d2.join();
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		d3.start();
		System.out.println("------------------");
		try {
			for(char i='A';i<'Z';i++)
			{
				sleep(3000);
				System.out.println(i);
				d2.join();
			}
			
		}catch (InterruptedException e) {
			
			e.printStackTrace();                         
		}
	}

}
