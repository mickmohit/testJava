package test.mohit.interviewPrep;

import java.util.Arrays;

public class ReverseArrayInPlaceWithoutusingAnotherArray {
	public static void main(String args[])
	{ 
		String[] names = {"John", "Jammy", "Luke","Mohit"}; 
	System.out.println("original array: " + Arrays.toString(names) );
	reverse(names);
	
	 System.out.println("reversed array: " + Arrays.toString(names) ); 
	 String[] test = {"John"}; 
	 System.out.println("original array: " + Arrays.toString(test) ); 
	 reverse(test);
	 System.out.println("reversed array: " + Arrays.toString(test) ); 
	 }
	
	public static String[] reverse(String[] array)
	{ 
		if (array == null || array.length < 2)
		{ return null;
		}
		for (int i = 0; i < array.length / 2; i++) 
		{ 
			String temp = array[i]; 
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp; 
			} 
		return array;
	} 
	

	
}
