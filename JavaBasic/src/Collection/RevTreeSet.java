package Collection;

import java.util.TreeSet;

public class RevTreeSet {

	public static void main(String[] args) {
         
		TreeSet t=new TreeSet();
		
		t.add("Gaurav");
		t.add("deepu");
		t.add("shivay");
		
		System.out.println(t);
		
		for(Object o:t) {
			System.out.println(o);
		}
		
		
	  TreeSet<Character> t2=new TreeSet<Character>();
	  
	  t2.add('A');
	  t2.add('B');
	  t2.add('C');
	  t2.add('D');
	  t2.add('E');
	  t2.add('F');
	  
	  System.out.println(t2);
	  System.out.println(t2.headSet('E', false));
	  System.out.println(t2);
	  System.out.println(t2.subSet('A', true, 'E', false));
	  System.out.println(t2);
	  System.out.println(t2.tailSet('A', false));
	  System.out.println(t2);
	  
	  
	}

}
