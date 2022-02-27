package loopsANDdecisionmaking;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, b, sum = 0;
		System.out.println("Armstrong nos are");
        for(int i = 1; i <= 500; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
        System.out.println();
	}

}
