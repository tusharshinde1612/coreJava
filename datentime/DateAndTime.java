package datentime;
import java.util.Calendar;

public class DateAndTime {

	public void sec()
	{
		long seconds = System.currentTimeMillis();
	     System.out.println(seconds+"\n");
	}

	/*
	 * Exercise 2 : Write a Java program to get and display information (year,
	 * month, day, hour, minute) of
	 * 
	 * a default calendar. Output should be for date 20th April 2018 time 1:57:00
	 * 
	 * Year: 2018
	 * 
	 * Month: 4
	 * 
	 * Day: 20
	 * 
	 * Hour: 1
	 * 
	 * Minute: 57
	 */
	public void dis()
	{
		 Calendar cal = Calendar.getInstance();
	       // Get and display information of current date from the calendar:
		    System.out.println();
	        System.out.println("Year: " + cal.get(Calendar.YEAR));
	        System.out.println("Month: " + cal.get(Calendar.MONTH));
	        System.out.println("Day: " + cal.get(Calendar.DATE));
	        System.out.println("Hour: " + cal.get(Calendar.HOUR));
	        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
	}
	//Exercise 3 : Write a Java program to get the last day of the current month.
	public void lastday()
	{
		Calendar calendar = Calendar.getInstance();
		      
		  System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
	//Exercise 4 : Write a Java program to get a day of the week of a specific date.
	public void specificday()
	{
		Calendar cal = Calendar.getInstance();
		
	      int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	      System.out.println("Day of the week : " + dayOfWeek); 
	}

	public static void main(String[] args) {
		DateAndTime d=new DateAndTime();
		d.sec();
		System.out.println();
		d.dis();
		System.out.println();
		d.lastday();
		System.out.println();
		d.specificday();
		System.out.println();
	}

}
