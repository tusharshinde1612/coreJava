package constructors;

public class Exercise2 {
	private int L,B;
	Exercise2()
	{
		L=0;
		B=0;
		System.out.println("Area = "+L*B);
	}
	Exercise2(int l,int b)
	{
		L=l;
		B=b;
		System.out.println("Area = "+L*B);
	}
	Exercise2(int lb){
		L=lb;
		B=lb;
		System.out.println("Area = "+L*B);
	}

	public static void main(String[] args) {
		Exercise2 a1=new Exercise2();
		Exercise2 a2=new Exercise2(12,5);
		Exercise2 a3=new Exercise2(12);

	}
}
