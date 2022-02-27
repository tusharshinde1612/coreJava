package loopsANDdecisionmaking;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=100;i++)
		{
			int temp=i,j=1,z=0;
			while(j<=temp)
			{
				if(i%j==0)
				{
					z++;
				}
				j++;
			}
			if(z==2)
			{
				System.out.print(" "+temp);
				System.out.println();
			}
		}
		
	}

}
