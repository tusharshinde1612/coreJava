package objAndclasses;
import java.util.*;

public class AccountHolder2 {

	String FirstName;
	String LastName;
	int Age;
	int AccountBalance;

	public AccountHolder2(String Fname, String Lname, int age, int bal) {
		this.FirstName = Fname;
		this.LastName = Lname;
		this.Age = age;
		this.AccountBalance = bal;
	}

	public boolean testEligibility() {
		if (Age > 25 && AccountBalance >= 20000) {
			return true;
		}
		return false;
	}

	public void printResult(boolean flag) {
		if (flag == true) {
			System.out.println(FirstName + " " + "you are eligible for credit card");
		} else {
			System.out.println(FirstName + " " + "you are not eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		int age;
		int bal;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person name:");
		name = sc.nextLine();
		System.out.println("Enter age:");
		age = sc.nextInt();
		System.out.println("Enter balance:");
		bal = sc.nextInt();

		switch (name) {
		case "tom":
			AccountHolder2 tom = new AccountHolder2("Tom", "Smith", age, bal);
			result = tom.testEligibility();
			tom.printResult(result);
			break;
		case "henry":
			AccountHolder2 henry = new AccountHolder2("Henry", "Hill", age, bal);
			result = henry.testEligibility();
			henry.printResult(result);
			break;
		case "sarah":
			AccountHolder2 sarah = new AccountHolder2("Sarah", "Miller", age, bal);
			result = sarah.testEligibility();
			sarah.printResult(result);
			break;
		default:
			System.out.println("No account found with name" + " " + name);
		}

	}

}

