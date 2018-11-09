package test.mohit;

import java.util.ArrayList;
import java.util.List;

public class NestedList {

	public static void main(String[] args)
	{
		List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
		
		List<List<Object>> list = new ArrayList<>();
		
		List<? extends List<Integer>> l= new ArrayList<ArrayList<Integer>>();
		
		List<Integer> ll= new ArrayList<Integer>();
		List<Integer> ll1= new ArrayList<Integer>();
		ll.add(1);ll.add(2);
		ll1.add(3);ll1.add(4);
		listOfList.add(ll);
		listOfList.add(ll1);
		
		System.out.println("Output: "+listOfList);
	
		List<List<Integer>> listOfList1 = new ArrayList<List<Integer>>();
		
		for(List<Integer> ins : listOfList)
		{
			for(Integer i : ins)
			{		
		System.out.println(i);	
		}
		}
	}
	
}


