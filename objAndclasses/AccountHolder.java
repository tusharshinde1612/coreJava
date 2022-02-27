package objAndclasses;

public class AccountHolder {
	String FirstName;
	String LastName;
	int Age;
	int AccountBalance;
	public AccountHolder(String Fname,String Lname,int age,int bal) {
		this.FirstName=Fname;
		this.LastName=Lname;
		this.Age=age;
		this.AccountBalance=bal;
		}
	public boolean testEligibility() {
		if(Age>25&&AccountBalance>=20000) {
			return true;
		}
		return false;
	}
	public void printResult(boolean flag) {
		if(flag==true) {
			System.out.println(FirstName+" "+"you are eligible for credit card");
		}else {
			System.out.println(FirstName+" "+"you are not eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		AccountHolder tom=new AccountHolder("Tom", "Smith", 21, 10000);
		AccountHolder henry=new AccountHolder("Henry", "Hill", 31, 20000);
		AccountHolder sarah=new AccountHolder("Sarah", "Miller", 41, 30000);
		result=tom.testEligibility();
		tom.printResult(result);
		result=henry.testEligibility();
		henry.printResult(result);
		result=sarah.testEligibility();
		sarah.printResult(result);
		
	}

}

