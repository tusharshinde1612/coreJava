package exceptions;

public class Exception {
	public void check_output()
	{
		try
		{ 
			int a = 0; 
			System.out.println ("a = " + a); 
			int b = 20 / a; 
			System.out.println ("b = " + b); 
		} 
		catch(ArithmeticException e) 
		{ 
			System.out.println ("Divide by zero error"); 
		} 
		finally
		{ 
			System.out.println ("inside the finally block"); 
		}
	}

	public void check2()
	{
		try
		{ 
			int a = 0; 
			System.out.println ("a = " + a); 
			int b = 20 / a; 
			System.out.println ("b = " + b); 
		} 
		catch(ArithmeticException e) 
		{ 
			System.out.println ("Divide by zero error"); 
		} 
		finally
		{ 
			System.out.println ("inside the finally block"); 
		} 
	}
	public static void main(String[] args) {
		Exception e=new Exception();
		e.check_output();
		e.check2();

	}
}
