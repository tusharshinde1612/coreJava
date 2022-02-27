package operators;

public class Exercise1 {
	private int i = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise1 e = new Exercise1();
		System.out.println("postfix = " + (e.i++));
		System.out.println(e.i);
		System.out.println("prifix = " + (++e.i));

	}

}
