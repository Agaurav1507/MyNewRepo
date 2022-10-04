package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Revrpiorityqueue {

	public static void main(String[] args) {
          
		HashSet h=new HashSet();
		
		h.add("automation");
		h.add("10lakhs");
		h.add(4578);
		
		System.out.println(h);
		
		Iterator itr=h.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		 
    }

}
