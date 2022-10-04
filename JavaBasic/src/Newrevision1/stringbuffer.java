package Newrevision1;

public class stringbuffer {

	public static void main(String[] args) {
           
		StringBuffer s=new StringBuffer("deepali");
               		
		s.append(5);
		System.out.println(s);
		
		System.out.println(s.capacity());
		
		s.reverse();
		System.out.println(s);
		
		s.setCharAt(2, 'i');
		
		System.out.println(s);
		
		StringBuilder sb=new StringBuilder("gaurav");
		
		
	}

}
