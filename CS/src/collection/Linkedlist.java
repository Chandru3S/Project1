package collection;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList hh=new LinkedList();
		hh.add(10);
		hh.add(10);
		hh.add(30);
		hh.add(1,40);
		hh.add(null);
		hh.add(3.5f);	
		hh.add(30.3);
		hh.add('@');
		hh.add("Rooman");
		LinkedList hh1=new LinkedList();
		hh1.add(110);
		hh1.add(26);
		hh1.add(34);
		hh1.add(4);
		System.out.println(hh.removeAll(hh1));
		System.out.println(hh);
		System.out.println(hh);
		System.out.println(hh.get(1));
		System.out.println(hh.indexOf(30));
		System.out.println(hh.lastIndexOf(10));
		System.out.println(hh.hashCode());
		System.out.println(hh.clone());
		System.out.println(hh.contains("suri"));
		System.out.println(".....................");
		System.out.println(hh);
		System.out.println(hh.isEmpty());

		System.out.println(hh.isEmpty());
		System.out.println(hh);
		hh.remove(3);
		System.out.println(hh);
		
	}
	

}




