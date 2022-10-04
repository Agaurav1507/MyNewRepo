package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class RevLinkedList {

	public static void main(String[] args) {
         
		LinkedList l1=new LinkedList();
		
		l1.add("Gaurav");
		l1.add("deepu");
		l1.add(5487);
		l1.add("Family");
		
		Iterator itr=l1.descendingIterator();
		
		System.out.println(itr.next());
		
		LinkedList<Integer> l2=new LinkedList<Integer>();
		
		l2.add(21);
		
		System.out.println(l1.getFirst());
		
		
	}

}
