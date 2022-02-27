package Arrays;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {20, 20, 30, 40, 50, 50, 50};
		int n=num.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(num[i]==num[j]) {
					n=n-1;
					for(int k=j;k<n;k++) {
						num[k]=num[k+1];
					}
				}
			}
		}
	    for(int i=0;i<n;i++) {
	    	System.out.println(num[i]);
	    }
		System.out.println("new length of an array is "+n);

	}

}
