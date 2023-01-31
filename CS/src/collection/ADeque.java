package collection;

import java.util.ArrayDeque;

public class ADeque {

	public static void main(String[] args) {


		ArrayDeque ad = new ArrayDeque();
		
		ad.add("@");
		ad.add(3);
		ad.add(3.19);
		ad.add('C');
		ad.add("Java");
		System.out.println(ad);
		System.out.println("\n"+ad.peek());
		System.out.println("\n"+ad);
		
		System.out.println("\n"+ad.poll());
		System.out.println("\n"+ad);
		
		ArrayDeque ads = new ArrayDeque();
		ads.push(20);
		ads.push(10);
		ads.push(30);
		ads.push(40);
		ads.push(50);
		ads.push(60);
		System.out.println("\n"+ads);
		
		System.out.println("\n"+ads.pop()+" "+ads.pop()+" "+ads.pop());;
		System.out.println("\n"+ads);
		
		System.out.println("\n"+ads.peek());
		System.out.println("\n"+ads);
		System.out.println("\n"+ads.poll());
		System.out.println("\n"+ads);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
