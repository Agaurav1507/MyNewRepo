package Collection;

import java.util.Vector;

public class RevVector {

	public static void main(String[] args) {
             
		Vector v=new Vector();
		
		v.add("World");
		v.add(5432);
		v.add('a');
		
		System.out.println(v.size());
		System.out.println(v);
		
		v.addElement("gau");
		System.out.println(v);
		
		v.setSize(10);
		
		
		
		System.out.println(v.size());
	}

}
