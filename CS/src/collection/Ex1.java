package collection;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("Red");
		ls.add("Green");
		ls.add("Orange");
		ls.add("White");
		ls.add("Black");
		System.out.println(ls);
		
		List als = new ArrayList();
		als.add(19);
		als.add(69);
		als.add(23);
		als.add(6);
		als.add(50);
		als.add(10);
		System.out.println("Before sort "+als);
		Collections.sort(als);
		System.out.println("After sort  "+als);

		System.out.println("\n---------------");

		ls.add(0, "Pink");     //add value in 1st position
		ls.add(5, "Yellow");   //add value in 6th position
		System.out.println(ls);

		System.out.println("\nRetrive the specific element");
		// Retrive the first and third element
		System.out.println(ls.get(0));
		System.out.println(ls.get(2));

		System.out.println("\n-Update the element");
		// Update the third element with "Yellow"
		ls.set(2, "Yellow");
		System.out.println(ls);

		System.out.println("\n-Remove the element");
		// Remove the third element from the list.
		ls.remove(2);
		System.out.println(ls);

		System.out.println("\n-Search the value Red");
		// Search the value Red
		if (ls.contains("Red")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}

		System.out.println("\n--------------");
		int a=0;
		for (String i : ls)    //for each loop
		{
			a++;
			System.out.println(a+": "+i);		
		}

		System.out.println("\n-reverse the values");
		//reverse the values
		Collections.reverse(ls);
		System.out.println(ls);

		System.out.println("\n-shuffle the values");
		//shuffle the values
		Collections.shuffle(ls);
		System.out.println(ls);

		System.out.println("\n=Copy List2 to ls");
		List<String> List2 = new ArrayList<String>();
		List2.add("A");
		List2.add("B");
		List2.add("C");
		List2.add("D");
		System.out.println("List2: " + List2);
		// Copy List2 to ls
		Collections.copy(ls, List2);
		System.out.println("List2: " + ls);

		System.out.println("\nExtract a portion of a array list");
		List<String> sub_ls = ls.subList(0, 3);
		System.out.println("List of first three elements: " + sub_ls);
	}


}
