package Newrevision1;

class Member {
	// Memmber variable of this class
	long phone;
	// Member function of this class
	void chat() {
		// Print message of Member/ Child class
		System.out.println("chatting in whatsapp group with "+phone);
	}
}
class Admin extends Member {
	// Member function of this class
	void addNumber() {
		// Print message of Admin/ Parent class
		System.out.println("adding a new user number in whatsapp group");
	}
}

public class derivedcasting {

	public static void main(String[] args) {
		
		Admin a=new Admin();
		
		a.addNumber();
		a.chat();
		
		//
		
		Member m=new Admin();
		
		m.chat();
		
		Admin b=(Admin) m;

	}

}
