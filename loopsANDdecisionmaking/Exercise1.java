package loopsANDdecisionmaking;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =29, j = 1, z = 0;
		while (j <= i) {
			if (i % j == 0) {
				z++;
			}
			j++;
		}
		if (z == 2) {
			System.out.println(i+" is a prime number");
		} else {
			System.out.println(i+" is not a prime number");
		}
	}

}
