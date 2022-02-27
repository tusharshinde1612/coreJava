package constructors;

public class Exercise4 {
	private String s1;
	Exercise4()
	{
		s1="i love Programming";
		System.out.println(s1);
	}
	Exercise4(String s)
	{
		s1="i love "+ s;
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Exercise4 p1=new Exercise4();
		Exercise4 p2=new Exercise4("Java");
	}
}
