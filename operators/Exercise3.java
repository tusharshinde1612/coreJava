package operators;

public class Exercise3 {
	public void between10And20(int i)
	{
		if(i>10&&i<20)
		{
			System.out.println(i+" is between 10 and 20");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise3 e=new Exercise3();
		e.between10And20(15);
	}

}
