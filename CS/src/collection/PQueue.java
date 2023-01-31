package collection;

import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		
		System.out.println(pq);
		
	PriorityQueue pq1 = new PriorityQueue();
		
		pq1.add(1);
		pq1.add(1.5f);
		pq1.add(3);
		pq1.add(3.19);
		pq1.add('C');
		pq1.add("java");
		pq1.add(true);
	
		System.out.println("\n"+pq1);

	}

}
