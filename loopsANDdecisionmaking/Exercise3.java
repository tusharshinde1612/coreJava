package loopsANDdecisionmaking;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0;
		int num=12345;
		while(num!=0)
		{
			int remainder = num % 10;  
			reverse = reverse * 10 + remainder;  
			num = num/10;  
		}
		System.out.println(reverse);
	}

}
