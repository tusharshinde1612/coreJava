package Arrays;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {9,8,7,6,5,4,6,7,3,1};
		System.out.println();
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Second largest element is "+num[num.length-2]);
	}

}
