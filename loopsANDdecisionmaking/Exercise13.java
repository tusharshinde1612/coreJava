package loopsANDdecisionmaking;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter unit price");
		double prise=sc.nextDouble();
		System.out.println("enter unit quantity");
		int qu=sc.nextInt();
		if(qu<100)
		{
			System.out.println("The revenue from sale:"+(qu*prise));
			System.out.println("After discount : "+(qu*prise)+"(0.0%)");
		}
		else if(qu<120)
		{
			System.out.println("The revenue from sale:"+(qu*prise));
			System.out.println("After discount : "+((qu*prise)-((qu*prise)*10/100))+"(10.0%)");
		}
		else
		{
			System.out.println("The revenue from sale:"+(qu*prise));
			System.out.println("After discount : "+((qu*prise)-((qu*prise)*15/100))+"(15.0%)");
		}
		
	}

}
