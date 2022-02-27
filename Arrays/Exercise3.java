package Arrays;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {3,5,1,7,8,54,3,7};
		int fn=7;
		for(int i = 0; i < num.length; i++)
	    {
	      if(num[i] == fn)   
	      {
	        System.out.println(num[i]+" deleted");
	        for(int j = i; j < num.length - 1; j++)
	        {
	            num[j] = num[j+1];
	        }
	        break;
	      }
	    }

	}

}
