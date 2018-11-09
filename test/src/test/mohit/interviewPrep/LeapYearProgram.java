package test.mohit.interviewPrep;

public class LeapYearProgram {
	public static void main(String args[]) {
		
		System.err.println("Does 2000 a leap year : " + doesLeapYear(2000));
        System.err.println("Does 2012 a leap year : " + doesLeapYear(2012));
        System.err.println("Does 1901 a leap year : " + doesLeapYear(1901));
        System.err.println("Does 1900 a leap year : " + doesLeapYear(1900));

	}

	public static boolean doesLeapYear(int year){
	       return (year%400 == 0) || ((year%100) != 0 && (year%4 == 0));
	   }
}
