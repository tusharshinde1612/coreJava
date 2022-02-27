package loopsANDdecisionmaking;

import java.util.Scanner;

public class Exercise18 {
	Scanner sc=new Scanner(System.in);
	public void sumdouble()
	{
		System.out.println("enter 1st num");
		int a=sc.nextInt();
		System.out.println("enter 2nd num");
		int b=sc.nextInt();
		if(a==b)
			System.out.println((a+b)*2);
		else
			System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise18 e=new Exercise18();
		e.sumdouble();
	}

}
