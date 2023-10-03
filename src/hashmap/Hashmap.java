package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		HashMap <Integer,String> hm= new HashMap <Integer,String>();
		hm.put(100, "Sakthi"); //to add key,value pair
		hm.put(101, "Priya");
		hm.put(102, "Anand");
	
		System.out.println(hm);
		
		//to get the values line by line
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
		
		
		hm.remove(101, "Priya");
		System.out.println(hm);
		
		hm.replace(100, "Sakthi Priya");
		System.err.println(hm);
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
		
	
	}

}
