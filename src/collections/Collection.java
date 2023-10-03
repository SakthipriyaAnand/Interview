package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Testing");  // index 0
		al.add("Testing1"); // index 1
		al.add("Testing2"); // index 2
		al.add("Testing3"); // allows duplicate values
		al.add("Testing3");
		
		System.out.println(al);
		
		al.add(2,"Testing1 changed");//add one array in index 2
		System.out.println(al); //we have upto index 3 here
		
		al.remove(3);
		System.out.println(al);
		
		System.out.println("-----------------------------");
		
		for (String i : al) {		// For printing without[] and in line by line
			System.out.println(i); 
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < al.size(); i++) {	// Using for loop
			System.out.println(al.get(i));
		}
		System.out.println("-----------------------------");
		
		Iterator <String> iterator = al.iterator();	// Using Iterator and while loop
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------------------------");
		
		ArrayList all=new ArrayList();
		all.add(1);
		all.add("string");
		all.add(null);
		all.add(" ");
		System.out.println(all);
		System.out.println("Size of Array List: "+all.size());
		
		Iterator itr= all.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
