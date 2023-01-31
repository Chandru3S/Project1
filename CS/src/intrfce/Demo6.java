package intrfce;

interface Display1
{
	public abstract void disp();
}

public class Demo6 {

	public static void main(String[] args) {

		Display1 d = new Display1() {

			@Override
			public void disp() {

				System.out.println("hi, baby!!!!");				
			}
		};
		d.disp();
	}

}
