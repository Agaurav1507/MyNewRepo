package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RevArraylist {

	public static void main(String[] args) {
           
		ArrayList a=new ArrayList();
		
		a.add("gaurav");
		a.add("loves");
		a.add("deepali");
		a.add(1234);
		
		System.out.println(a.size());
		System.out.println(a);
		
		System.out.println("traversing through for loop");
            
		for(int i=0;i<a.size();i++) {
			
			System.out.println(a.get(i));
		}
		
		System.out.println("traversing through for each loop");
		
		for(Object o:a) {
			System.out.println(o);
		}
		
		System.out.println("acces the elemnt = "+a.get(2));
		
		System.out.println("set the element = "+a.set(3, 4321));
		
		System.out.println(a);
		
	    Iterator itr=a.iterator();
	    
	    for(int i=0;i<a.size();i++) {
	    	
	    	System.out.println(itr.next());
	    }
		
		
	}

}
