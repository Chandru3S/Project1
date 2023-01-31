package collection;

import java.util.ArrayList;

public class AList1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(40);
		al.add(20);
		al.add(10);
		al.add(20);
		
		System.out.println(al);
		System.out.println(al.getClass());
		System.out.println(al.hashCode());
		System.out.println(al.indexOf(50));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf(20));
		al.remove(4);
		System.out.println(al);
		System.out.println("------------------------");
		ArrayList<Integer> al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add(20);
		
		
//		al.removeAll(al1);
//		System.out.println(al);
		
//		al.retainAll(al1);
//		System.out.println(al);
		
		al.set(1, 100);
		System.out.println(al);
		System.out.println(al.size());
//		al.add(7,300);
//		System.out.println(al);
		
		
		
//		System.out.println("--------------------");
//		System.out.println(al.get(3));
//		System.out.println("--------------------");
//		
//		for(int i:al)
//		{
//			System.out.println(i);
//		}
//		al.add(3,30);
//		System.out.println(al);
//
//		ArrayList<Integer> all = new ArrayList();
//		all.add(100);
//		all.add(200);
//		all.add(300);
//		all.add(400);
//		all.add(500);
//
//		all.addAll(al);
//		al.addAll(3, all);
//		System.out.println(al);
//		all.clear();
//
//		System.out.println(all);
//		System.out.println(al.contains(1000));
//	




















		//		ArrayList al = new ArrayList();
		//		al.add(null);
		//		al.add('C');
		//		al.add(3.19);
		//		al.add("Chandru");
		//		al.add(true);
		//		
		//		System.out.println(al);
		//		System.out.println("-------------");
		//		for(int i=0;i<al.size();i++)
		//		{
		//			System.out.println(al.get(i));
		//		}
		//		










	}

}
