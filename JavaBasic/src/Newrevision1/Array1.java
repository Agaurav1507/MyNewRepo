package Newrevision1;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
            
		int[] a= {2,1,5,8,7,9,6,4,2,5};
		
		int[] b=a.clone();
		
		
		System.out.println(Arrays.equals(a, b));
		
		for(int c:a) {
			System.out.println(c);
		}
		
		for(int i=0;i<b.length;i++) {
			
			System.out.println(b[i]);
		}
		
		System.out.println("*********************************");
		
		int[] z=Arrays.copyOfRange(a, 1, 3);
		
		for(int u:z) {
			System.out.println(u);
		}
		
		Arrays.sort(a);
		
		for(int s:a) {
			System.out.println(s);
		}
	}

}
