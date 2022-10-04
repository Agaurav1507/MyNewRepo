package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RevHashmap {

	public static void main(String[] args) {
           
		HashMap<Integer,Object> h=new HashMap<Integer,Object>();
		
		h.put(101, "Gaurav");
		h.put(102, "Deepu");
		h.put(103, "vishal");
		h.put(104, "shivay");
		h.put(105, "charul");
		h.put(106, "mom");
		h.put(105, "charul");
		
		System.out.println(h);
		
		for(Map.Entry A:h.entrySet() ) {
			System.out.println(A);
		}
		
		TreeMap t=new TreeMap();
		
	    
		
	}

}
