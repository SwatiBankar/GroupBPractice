package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("swati");
		list.add("uddhav");
		list.add("pachrne");
		list.add("bankar");
		
		ListIterator<String> itr=list.listIterator();
		
		System.out.print("list elements are as follow:");
		
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
	       System.out.println();
		
		
		while(itr.hasPrevious())
			
		System.out.print(itr.previous()+" ");
		System.out.println();
		
		

	}

}
