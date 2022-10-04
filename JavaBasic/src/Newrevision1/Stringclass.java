package Newrevision1;

public class Stringclass {

	public static void main(String[] args) {
         
		String s1="javagoal";
		
		
		String[] d=s1.split(" ");
		
		System.out.println(s1.length());
		
		
		
		String s2=new String("sandip foundation");
		
		System.out.println(s2.length());
		
		String s3=s2.concat("gaurav");
		
		for(int i=0;i<s2.length();i++) {
			
			System.out.println(s2.charAt(i));
		}
		
		System.out.println(s3);
		
		for(String s:d) {
			System.out.println(s);
		}
	}

}
