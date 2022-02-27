package Arrays;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {9,8,7,6,5,4,6,7,3,1};
		int even=0;
		int odd=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even nos in array are "+even);
		System.out.println("odd nos in array are "+odd);
	}

}
