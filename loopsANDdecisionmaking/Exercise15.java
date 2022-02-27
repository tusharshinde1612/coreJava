package loopsANDdecisionmaking;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int a=sc.nextInt();
		if(a<18)
			System.out.println("not eligible");
		else
			System.out.println("eligible");
	}

}
