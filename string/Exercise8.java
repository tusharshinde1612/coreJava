package string;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		int n=2;
		String s1=s.substring(s.length()-n);
		for(int i=0;i<n;i++) {
			System.out.print(s1);
		}
	}

}
