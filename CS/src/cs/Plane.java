package cs;

class Demo2
{
	private static String name;
	private static int capacity;
	
	public static int getCapacity() {
		return capacity;
	}
	
	public static void setCapacity(int capacity) {
		Demo2.capacity = capacity;
	}
	
	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		Demo2.name = name;
	}

}


public class Plane {

	public static void main(String[] args) {

		
		Demo2.setCapacity(185);
		Demo2.setName("Chandru S");
		
		System.out.println(Demo2.getCapacity());
		System.out.println(Demo2.getName());

	}

}
