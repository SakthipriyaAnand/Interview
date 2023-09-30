package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListFunc {

	public static void main(String[] args) {
		List <String> al =new ArrayList<String>();
		al.add("Testing");
		List <String> al1 =new LinkedList<String>();
		al1.add(null);
		al1.add("Testing");
		al1.add(" ");
	System.out.println(al1);
	List <Integer> al2 =new LinkedList<Integer>();
		al2.add(null);		// its printing null in output
		//al2.add();		//in string it is accepting space but not in integer
		System.out.println(al2);
		
		Vector<String> v=new Vector<String>();
		v.add("Testing");
		v.add(null);
		v.add(" ");
		System.out.println(v);
	}

}
