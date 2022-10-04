package AllprogRevision;

public class CheckArmstrongNum {

	public static void main(String[] args) {
         
		int num=407;
		int sum=0;
		
		for(int i=num;i>0;i=i/10) {
			
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		
		if(sum==num) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
	}

}
