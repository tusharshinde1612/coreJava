package numberClass;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner( System.in ); 
		int n, r = 1, num, sum = 0;
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }
	}

}
