package test.mohit.sort;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CustomSortStudent {
	
	 
	// A class to represent a student.
	
	    int rollno;
	    String name, address;
	 
	    // Constructor
	    public CustomSortStudent(int rollno, String name,
	                               String address)
	    {
	        this.rollno = rollno;
	        this.name = name;
	        this.address = address;
	    }
	 
	    // Used to print student details in main()
	    public String toString()
	    {
	        return this.rollno + " " + this.name +
	                           " " + this.address;
	    }
	}
	 
	class Sortbyroll implements Comparator<CustomSortStudent>
	{
	    // Used for sorting in ascending order of
	    // roll number
	    public int compare(CustomSortStudent a, CustomSortStudent b)
	    {
	        return a.rollno - b.rollno;
	    }
	}
	 
	// Driver class
	class Main
	{
	    public static void main (String[] args)
	    {
	    	CustomSortStudent [] arr = {new CustomSortStudent(111, "bbbb", "london"),
	                          new CustomSortStudent(131, "aaaa", "nyc"),
	                          new CustomSortStudent(121, "cccc", "jaipur")};
	 
	        System.out.println("Unsorted");
	        for (int i=0; i<arr.length; i++)
	            System.out.println(arr[i]);
	 
	        Arrays.sort(arr, new Sortbyroll());
	 
	        System.out.println("\nSorted by rollno");
	        for (int i=0; i<arr.length; i++)
	            System.out.println(arr[i]);
	    }
	}
