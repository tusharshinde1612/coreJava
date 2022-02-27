package constructors;

public class Exercise1 {
	private String Name;
	Exercise1()
	{
		System.out.println("Unkown Person");
	}
	Exercise1(String name)
	{
		this.Name=name;
		System.out.println(Name);
	}

	public static void main(String[] args) {
		Exercise1 e=new Exercise1();
		Exercise1 e1=new Exercise1("Tushar");
		
	}
}
