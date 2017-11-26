package wb;
//import java.io.*;
//import java.util.*;


public class NextDate {
	
	
	public NextDate(int m, int d, int y)
	{
		//int month, day, year; //varibles holding the month, day and year args
		//Initialize the mont, day, and year, respectively
		//month = m;
		//day = d;
		//year = y;
	}
	
	
	/*********************************************************
	**Method: run
	**Returns: string
	**Description: This method will return a string depicting the nextDate in the from MM/DD/YY 
	***********************************************************/
	
	public String run(int month, int day, int year) {
		
		//Restrictions that the year must have the following invariant: 1801 <= year <= 2021
		
		if (day < 1 || month < 1 || month >12 || year < 1801 || year > 2021)
			return "invalid Input Date";
		
		//these variables will hold the proper values for the nextDate's day, month, and year values, respectively
		int tomorrowDay = day;
		int tomorrowMonth = month;
		int tomorrowYear = year;
		
		//Is this month with 31 days?
		if(isThirtyOneDayMonth(month))
		{
			if(day < 31) //if the day is not 31, just increment the day
				tomorrowDay = day +1;
			else{ //day = 31, set tomorrow's day to 1 and increment the month
				tomorrowDay = 1;
				tomorrowMonth = month + 1;
			}
		}
		//is this month a month with 30 days?
		else if (isThirtyDayMonth(month))
		{
			if(day <30) //if the day is not 30, just increment the day
				tomorrowDay = day + 1;
			else {
				if(day == 30){
					tomorrowDay = 1;
					tomorrowMonth = month +1;
				}
				else //invalid input ... too many days
					return "Invalid Input Date";
			}
		}
		//is this month December?
		else if(isDecember(month))
		{
			if (day <= 31) //if the day is not 31, just increment the next day
				tomorrowDay = day +1;
			else { //day is 31, reset the day and month to 1 and increment the year
				tomorrowDay = 1;
				tomorrowMonth = 1;
				if(year == 2021) //make sure the next year is within ht permissible range
					return "Invalid Next Year";
				else  //it was a permissible year - go ahead and increment the year
					tomorrowYear = year +1;
			}
				
		}
		//is this month February? we need to check for leap years and such
		else if(isFebruary(month))
		{
			if(day < 28) //just a standard day - increment the day
				tomorrowDay =day +1;
			else {
				if(day == 28) {  //if this is not a leap year, reset day and increment the day 
					if(isLeapYear(year)) //was a leap year
						tomorrowDay = 29;
					else {  //was not a leap year
						tomorrowDay = 1;
						tomorrowMonth = 3;
					}
				}
				else if(day == 29){ //29th date of February
					if(isLeapYear(year)){  //AND a leap year - reset the day to 1, month to 3
						tomorrowDay = 1;
						tomorrowMonth = 3;
					}
					else
						return "Invalid Input Date";
				}
				else if(day > 29) //invalid input as February will never have more than 29 days
					return "Invalid Input Date";
			}
		}
		//return the string representing the nextDate, in the form MM/DD/YY
		return tomorrowMonth + "/" + tomorrowDay + "/" + tomorrowYear;

	}
	
	
	/*********************************************
	 * Method: isThirtyOneDayMonth
	 * @param month
	 * @returns boolean
	 * Description: This method will return true is 'month' corresponds to a 
	 * month that contains 31 days, excluding December
	 */
	
	private static boolean isThirtyOneDayMonth(int month)
	{
		return month == 1 || month == 3 || month == 5 || month == 8 || month == 10;
	}
	
	
	/*************************************************
	 * Method: isThirtyDayMonth
	 * @param month
	 * @returns boolean
	 * Description: This method will return true if 'month' corresponds to a
	 * month that contains 30 days.	 * 
	 */
	
	private static boolean isThirtyDayMonth(int month)
	{
		return month == 4 || month == 6 || month == 9 || month == 11;
	}
	
	
	/**************************************************
	 * Method: isDecember
	 * @param month
	 * @returns boolean
	 * Description: This method will return true if 'month' corresponds to
	 * December
	 */
	
	private static boolean isDecember(int month)
	{
		return month == 12;
	}
	
	
	/****************************************************
	 * Method: isFebruary
	 * @param month
	 * @returns boolean
	 * Description: This method will return true if 'month' corresponds to
	 * February
	 */
	
	private static boolean isFebruary(int month)
	{
		return month == 2;
	}
	
	
	/*****************************************************
	 * Method: isLeapYear
	 * @param year
	 * @returns boolean
	 * Description: This method will return true if 'year' corresponds to a
	 * leap year. It works like this:
	 * 			*If the year is not a century year and divisible by 4,
	 * 			then it is a leap year
	 * 			*If the year is a century year, it is a leap year if and only if 
	 * 			it is divisible by 400
	 */
	
	private static boolean isLeapYear(int year)
	{
		if((year % 100) == 0)
			return (year % 400) == 0;
		else
			return (year % 4) == 0;
	}
	
	
	/****************************************************
	 * Main method is only used for testing purposes, no unit tests need to 
	 * be written for this method.
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		NextDate q;
		int month1, day1, year1;

		
		q =	new NextDate(
				month1=Integer.parseInt(args[0]),
				day1=Integer.parseInt(args[1]),
				year1=Integer.parseInt(args[2]));
		

		System.out.println("Type: " + q.run( month1, day1, year1));
		
	}


}


