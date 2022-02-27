package Arrays;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"hello","world","hello","everyone"};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					System.out.println("Duplicate element is:"+s[j]);
				}
			}
		}
	}

}
