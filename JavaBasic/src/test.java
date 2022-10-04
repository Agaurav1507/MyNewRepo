
public class test {
	
	static void getchat(int s) {
		
		if(s<3) {
			System.out.println("from gc:" +s);
			return;
			
		}
		
		getchat(s--);
		
		
	}

	public static void main(String[] args) {
            
		test.getchat(5);
	}

}
