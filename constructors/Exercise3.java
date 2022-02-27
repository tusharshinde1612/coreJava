package constructors;

public class Exercise3 {
	private static int Bal;
	Exercise3()
	{
		Bal=50;
		System.out.println("Balance = "+Bal);
	}
	Exercise3(int bal)
	{
		Bal=Bal+bal;
		System.out.println("Balance = "+Bal);
	}

	public static void main(String[] args) {
		Exercise3 e1=new Exercise3();
		Exercise3 e2=new Exercise3(25);
		

	}


}
