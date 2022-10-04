package Newrevision1;

public class Staticblocks {
	
    static {
    	
    	System.out.println("static block activated");
    }
    
    {
    	
    	System.out.println("non static block activated");
    }

	public static void main(String[] args) {
		
		
		Staticblocks demo=new Staticblocks();
		
		
		
	}

}
