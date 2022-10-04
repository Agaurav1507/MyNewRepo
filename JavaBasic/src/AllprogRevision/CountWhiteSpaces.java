package AllprogRevision;

public class CountWhiteSpaces {

	public static void main(String[] args) {
           
		String name= " A c c e l e r a t i o n ";
		
		int count=0;
		for(int i=0;i<=name.length()-1;i++) {
			
			char str=name.charAt(i);
		
			if(str==' ') {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
