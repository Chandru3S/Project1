  package thread;

import java.util.Scanner;

class Task1 extends Thread
{
	public void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println("addition prog has started");
		System.out.println("Enter the first No");
		int a = sc.nextInt();
		System.out.println("Enter the second No");
		int b = sc.nextInt();

		int c=a+b;
		System.out.println("addition prog has ended. Sum is :"+c);

	}
}
class Task2 extends Thread
{
	public void run() {

		System.out.println("Character printing has started");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("character printing has ended ");

	}
}
class Task3 extends Thread
{
	public void run() {

		System.out.println("printing No's has started");

		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("printing No's has ended");
	}

}

public class Demo2 {

	public static void main(String[] args) {
	
//		Task1 t1 = new Task1();
//		Task2 t2 = new Task2();
//		Task3 t3 = new Task3();
//		
//		t1.start();
//		t2.start();
//		t3.start();
		
		Thread t = new Task1();
		t.start();
		
			   t = new Task2();
        t.start();
		       t = new Task3();
		t.start();
		t.isDaemon();
		       
		

	}

}
//Perform Multi Threading in printing 2*1=2  3*1=3 and 5*1=5.

//First do it in sequential manner and then by multi threading.

