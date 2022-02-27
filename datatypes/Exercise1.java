package datatypes;

public class Exercise1 {
	private boolean b=true;
	public boolean bool() {
		
		if(b==true) {
			b=false;
		}
		return b;
		
	}
	public static void main (String[] args) {
		Exercise1 e=new Exercise1();
		boolean p=e.bool();
		System.out.println(p);
	}
}
