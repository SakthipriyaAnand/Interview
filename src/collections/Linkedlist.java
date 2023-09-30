package collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList<Comparable> al1 = new LinkedList<Comparable> ();
		al1.add(1);
		al1.add("String");
		al1.add(1.2);
		al1.add(null);
		System.out.println(al1);
		
		LinkedList<String> al= new LinkedList<String>();
		 
		al.add("Testing");
		al.add("Testing1"); // index 1
		al.add("Testing2"); // index 2
		al.add(null);
		
		al.addFirst("Testing0");
		al.addLast("Testing3");
		
		System.out.println(al);
		al.remove(0);
		al.removeLast();
		System.out.println(al);
	}

}
