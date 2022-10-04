package AllprogRevision;

public class CheckforPalindrome {

	public static void main(String[] args) {
           
		String num="mom";
		String rev="";
		
		for(int i=num.length()-1;i>=0;i--) {
			
			rev=rev+num.charAt(i);
		}
		
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(num)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
