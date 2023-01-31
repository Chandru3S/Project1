package cs;

class Planee
{
	private String name;
	private int capacity;

	public Planee(String name, int capacity)
	{
		this.name=name;
		this.capacity=capacity;
	}
	
//	public Planee() {
//		
//	}

	public String getName() {
		return name;
	}
	
	public int getCapacity() {
		return capacity;
	}	

	
}


public class Demo3 {

	public static void main(String[] args) {
		
		Planee p = new Planee("AirIndia",185);
		System.out.println(p.getName()+"\n"+p.getCapacity());
		
		Planee p1 = new Planee();
		System.out.println(p1.getCapacity()+"\n"+p1.getName());

		
		
		
	

	}

}
