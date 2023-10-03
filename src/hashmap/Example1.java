package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1=new HashMap<Integer, String>();
			hm1.put(1, "Id");
			hm1.put(2, "Name");
			hm1.put(3, "Company");
		
		System.out.println(hm1.isEmpty());
		System.out.println(hm1.toString());
		System.out.println(hm1.equals(null));
		System.out.println("---------------------------");
		
		for(Map.Entry m:hm1.entrySet()) {
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
		System.out.println("---------------------------");
	//	ArrayList <Integer, String> al1=new ArrayList <Integer, String>(); // it is not possible in arraylist
		
		ArrayList  al1=new ArrayList();
			al1.add(12);
			al1.add("Name");
			al1.add("Company");
		
			Iterator itor= al1.iterator();
				while(itor.hasNext()) {
					System.out.println(itor.next());
		}
		
		System.out.println("---------------------------");
		
		HashMap<String, String> hm2=new HashMap<String, String>();
			hm2.put("Name:", "Sakthi");
			hm2.put("Department:", "Testing");
			hm2.put("Company:", "Shimakh Technology");
		
		
		for(Map.Entry m:hm2.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("---------------------------");
		
		HashMap <Comparable,Comparable> hm3 =new HashMap <Comparable,Comparable>();
			hm3.put("Name:", "Sakthi");
			hm3.put("Department:", "Testing");
			hm3.put("Id:", 12);
		
		for(Map.Entry m1:hm3.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}

}
