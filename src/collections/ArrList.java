package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> al=new ArrayList<Comparable>();
		al.add(12);
		al.add("sakthi");
		System.out.println(al);
		System.out.println(al.get(1));
		
		int listsize=al.size();
		for (int i = 0; i < listsize; i++) {
			System.out.println("Index "+i+" is: "+al.get(i));
		}
System.out.println("----------------------------------------------------------");
					
				//using for each loop

			for(Object alItems : al) {
				System.out.println("index "+al.indexOf(alItems)+" is: "+alItems);
}
			
System.out.println("-------------------------------------------------------------");	

System.err.println("Using iterators");
			@SuppressWarnings("rawtypes")
			Iterator<Comparable> itr = al.iterator();

				while(itr.hasNext()){
					Object value=itr.next();
						System.out.println("Values are "+value);
				}
	}
	

}
