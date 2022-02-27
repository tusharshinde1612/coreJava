package objAndclasses;
//Accountant Ravi has mail id ravi@gmail.com and contact No 9867785694
//Accountant Rutuja has mail id rutuja@gmail.com and contact No 9987565634.
public class Accountant {
	String name;
	String mail;
	long contact;
	public Accountant(String name,String mail,long contact) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.mail=mail;
		this.contact=contact;
	}
	void AccountantInfo() {
		System.out.println("Account "+name+" has emailId "+mail+" and contact number "+contact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Accountant ravi=new Accountant("Ravi","ravi@gmail.com",9867785694L);
		Accountant rutuja=new Accountant("Rutuja","rutuja@gmail.com",9987565634L);
		ravi.AccountantInfo();
		rutuja.AccountantInfo();
	}

}

